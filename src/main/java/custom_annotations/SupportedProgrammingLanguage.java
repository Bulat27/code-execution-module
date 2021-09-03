package custom_annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ContactNumberValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SupportedProgrammingLanguage {

    String message() default "Programming language not supported. Supported languages are: C#(51), Java(62), JavaScript(63), PHP(68) and Python(71)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
