package com.judge0.sample_code_execution.model;

public class SubmissionParameter {

    private String sourceCode;
    private Integer languageId;

    public SubmissionParameter() {
    }

    public SubmissionParameter(String sourceCode, Integer languageId) {
        this.sourceCode = sourceCode;
        this.languageId = languageId;
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
}
