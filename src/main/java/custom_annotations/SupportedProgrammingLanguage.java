package custom_annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ContactNumberValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SupportedProgrammingLanguage {

    String message() default "Programming language not supported.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
