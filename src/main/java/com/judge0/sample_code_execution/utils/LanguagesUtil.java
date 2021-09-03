package com.judge0.sample_code_execution.utils;

import java.util.Map;

public class LanguagesUtil {

    private static final Map<Integer, String> supportedLanguages = Map.of(
            51, "C#",
            62, "Java",
            63, "JavaScript",
            68, "PHP",
            71, "Python"
    );

    public static boolean isLanguageSupported(int languageId){
        return supportedLanguages.containsKey(languageId);
    }
}
