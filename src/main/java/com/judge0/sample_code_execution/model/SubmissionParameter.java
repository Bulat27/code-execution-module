package com.judge0.sample_code_execution.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.judge0.sample_code_execution.languages.ProgrammingLanguages;

import javax.validation.constraints.NotNull;

public class SubmissionParameter {

    @JsonProperty("source_code")
    private String sourceCode;
    @JsonProperty("language_id")
    @NotNull
    private Integer languageId;
    @JsonProperty("expected_output")
    private String expectedOutput;


    public SubmissionParameter() {
    }

    public SubmissionParameter(String sourceCode, Integer languageId, String expectedOutput) {
        this.sourceCode = sourceCode;
        this.languageId = languageId;
        this.expectedOutput = expectedOutput;
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
}
