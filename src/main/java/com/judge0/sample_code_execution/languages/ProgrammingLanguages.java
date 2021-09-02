package com.judge0.sample_code_execution.languages;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum ProgrammingLanguages {
    C_SHARP(51),
    JAVA(62),
    JAVA_SCRIPT(63),
    PHP(68),
    PYTHON(71);

    private final Integer language;

    ProgrammingLanguages(Integer language){
        this.language = language;
    }

    public Integer getLanguage() {
        return language;
    }

}
