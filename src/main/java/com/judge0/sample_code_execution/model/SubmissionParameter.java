package com.judge0.sample_code_execution.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class SubmissionParameter {

    @NotNull
    @JsonProperty("source_code")
    private String sourceCode;
    @JsonProperty("language_id")
    @NotNull
    private Integer languageId;
    @JsonProperty("expected_output")
    private String expectedOutput;
    @JsonProperty("stdin")
    private String input;

    public SubmissionParameter() {
    }

    public SubmissionParameter(String sourceCode, Integer languageId, String expectedOutput, String input) {
        this.sourceCode = sourceCode;
        this.languageId = languageId;
        this.expectedOutput = expectedOutput;
        this.input = input;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
