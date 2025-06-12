package sn.ism.gestion.utils.Validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;

@Documented
@Constraint(validatedBy = ListNotEmptyValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ListNotEmpty {
    String message() default "La liste ne doit pas être vide";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
