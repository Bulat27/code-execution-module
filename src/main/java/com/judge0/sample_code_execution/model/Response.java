package com.judge0.sample_code_execution.model;

public class Response {

    private ResponseJsonFields responseJsonFields;
    private String expectedOutput;

    public Response(ResponseJsonFields responseJsonFields, String expectedOutput) {
        this.responseJsonFields = responseJsonFields;
        this.expectedOutput = expectedOutput;
    }

    public Response() {
    }

    public ResponseJsonFields getResponseJsonFields() {
        return responseJsonFields;
    }

    public void setResponseJsonFields(ResponseJsonFields responseJsonFields) {
        this.responseJsonFields = responseJsonFields;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
    }
}
