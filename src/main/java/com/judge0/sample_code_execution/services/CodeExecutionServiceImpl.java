package com.judge0.sample_code_execution.services;

import com.judge0.sample_code_execution.model.Response;
import com.judge0.sample_code_execution.model.StatusToken;
import com.judge0.sample_code_execution.model.SubmissionParameter;
import exception_handling.ResponseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;


@Service
public class CodeExecutionServiceImpl implements CodeExecutionService{

    private final WebClient webClient;

    @Autowired
    public CodeExecutionServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Response submitCode(SubmissionParameter submissionParameter)  {
        StatusToken statusToken = getStatusToken(submissionParameter);
        //I will implement the logic of making a request multiple times until the code execution is done. This is just temporary.
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        return webClient.get()
//                .uri("/submissions/" + statusToken.getToken() + "?base64_encoded=false&fields=*")
//                .retrieve()
//                .bodyToMono(Response.class)
//                .block();
        return webClient.post()
                .uri("/submissions/?base64_encoded=false&wait=true")
                .body(Mono.just(submissionParameter), Response.class)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
    }

    private StatusToken getStatusToken(SubmissionParameter submissionParameter){
        try {
            return webClient.post()
                    .uri("/submissions/?base64_encoded=false&wait=false")
                    .body(Mono.just(submissionParameter), StatusToken.class)
                    .retrieve()
                    .bodyToMono(StatusToken.class)
                    .block();
        } catch (WebClientResponseException e) {
            throw new ResponseException(e.getMessage());
        }
    }
}
