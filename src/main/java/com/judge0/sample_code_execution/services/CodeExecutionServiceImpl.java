package com.judge0.sample_code_execution.services;

import com.judge0.sample_code_execution.model.Response;
import com.judge0.sample_code_execution.model.StatusToken;
import com.judge0.sample_code_execution.model.SubmissionParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return webClient.get()
                .uri("/submissions/" + statusToken.getToken() + "?base64_encoded=false&fields=*")
                .retrieve()
                .bodyToMono(Response.class)
                .block();
    }

    private StatusToken getStatusToken(SubmissionParameter submissionParameter){
        return webClient.post()
                .uri("/submissions/?base64_encoded=false&wait=false")
                .body(Mono.just(submissionParameter), StatusToken.class)
                .retrieve()
                .bodyToMono(StatusToken.class)
                .block();
    }
}
