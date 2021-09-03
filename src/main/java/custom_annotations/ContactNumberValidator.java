package custom_annotations;


import com.judge0.sample_code_execution.utils.LanguagesUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<SupportedProgrammingLanguage, Integer> {

    @Override
    public void initialize(SupportedProgrammingLanguage constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer languageId, ConstraintValidatorContext context) {
        return LanguagesUtil.isLanguageSupported(languageId);
    }
}
