package custom_annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Map;

public class ContactNumberValidator implements ConstraintValidator<SupportedProgrammingLanguage, Integer> {

    private static final Map<String, Integer> supportedLanguages;

    static{
        supportedLanguages = Map.of("C#", 51, "Java", 62, "JavaScript", 63, "PHP", 68, "Python", 71);
    }

    @Override
    public void initialize(SupportedProgrammingLanguage constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer languageId, ConstraintValidatorContext context) {
        return supportedLanguages.containsValue(languageId);
    }
}
