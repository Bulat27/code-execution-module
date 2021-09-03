package custom_annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<SupportedProgrammingLanguage, Integer> {

    @Override
    public void initialize(SupportedProgrammingLanguage constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer languageId, ConstraintValidatorContext context) {
        return languageId == 51 || languageId == 62 || languageId == 63 || languageId == 68 || languageId == 71;
    }
}
