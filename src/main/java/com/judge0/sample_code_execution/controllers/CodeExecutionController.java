package com.judge0.sample_code_execution.controllers;

import com.judge0.sample_code_execution.model.Response;
import com.judge0.sample_code_execution.model.SubmissionParameter;
import com.judge0.sample_code_execution.services.CodeExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


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

}
