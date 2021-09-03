package com.judge0.sample_code_execution.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    @JsonProperty("stdout")
    private String output;
    @JsonProperty("expected_output")
    private String expectedOutput;
    private Status status;
    @JsonProperty("compile_output")
    private String compileOutput;
    @JsonProperty("stderr")
    private String standardError;
    private String message;
    private String wrongAnswerMessage;

    public Response() {
    }

    public Response(String output, String expectedOutput, Status status, String compileOutput, String standardError, String message, String wrongAnswerMessage) {
        this.output = output;
        this.expectedOutput = expectedOutput;
        this.status = status;
        this.compileOutput = compileOutput;
        this.standardError = standardError;
        this.message = message;
        this.wrongAnswerMessage = wrongAnswerMessage;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCompileOutput() {
        return compileOutput;
    }

    public void setCompileOutput(String compileOutput) {
        this.compileOutput = compileOutput;
    }

    public String getStandardError() {
        return standardError;
    }

    public void setStandardError(String standardError) {
        this.standardError = standardError;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getWrongAnswerMessage() {
        return wrongAnswerMessage;
    }

    public void setWrongAnswerMessage(String wrongAnswerMessage) {
        this.wrongAnswerMessage = wrongAnswerMessage;
    }
}
