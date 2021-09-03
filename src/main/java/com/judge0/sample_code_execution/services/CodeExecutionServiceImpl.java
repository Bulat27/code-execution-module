package com.judge0.sample_code_execution.services;

import com.judge0.sample_code_execution.model.Response;
import com.judge0.sample_code_execution.model.SubmissionParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CodeExecutionServiceImpl implements CodeExecutionService{

    private static final int WRONG_ANSWER_STATUS_ID = 4;
    private static final String URL = "https://ce.judge0.com/submissions/?base64_encoded=false&wait=true";
    private final RestTemplate restTemplate;

    @Autowired
    public CodeExecutionServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Response submitCode(SubmissionParameter submissionParameter)  {
        return getResponse(submissionParameter);
    }

    private Response getResponse(SubmissionParameter submissionParameter){
        Response response = Optional.ofNullable(restTemplate.postForObject(URL, submissionParameter, Response.class)).orElseThrow();

        response.setExpectedOutput(submissionParameter.getExpectedOutput());
        if(response.getStatus().getId() == WRONG_ANSWER_STATUS_ID)
            response.setWrongAnswerMessage("Your output: " + response.getOutput() + "doesn't match the expected output: " + response.getExpectedOutput());
        return response;
    }
}
