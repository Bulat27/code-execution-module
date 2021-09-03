package com.judge0.sample_code_execution.controllers;

import com.judge0.sample_code_execution.model.Response;
import com.judge0.sample_code_execution.model.SubmissionParameter;
import com.judge0.sample_code_execution.services.CodeExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;
import java.util.NoSuchElementException;


@Controller
@RequestMapping("/api/code")
public class CodeExecutionController {

    private final CodeExecutionService codeExecutionService;

    @Autowired
    public CodeExecutionController(CodeExecutionService codeExecutionService) {
        this.codeExecutionService = codeExecutionService;
    }

    @PostMapping
    public ResponseEntity<Response> executeCode(@RequestBody @Valid SubmissionParameter submissionParameter){
        return ResponseEntity.ok(codeExecutionService.submitCode(submissionParameter));
    }

    //These should be in the ControllerAdvisor. For some reason, in this project it only works here. I will see its behaviour in the real project.
    @ExceptionHandler({HttpClientErrorException.class})
    public ResponseEntity<Object> handleHttpClientErrorException(HttpClientErrorException ex, WebRequest request){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler({NoSuchElementException.class})
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException ex, WebRequest request){
        return new ResponseEntity<>("There is something wrong with the response. Please check your input and try again.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
