package com.github.cunvoas.annotation.locale.fr;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.github.cunvoas.constraint.locale.fr.ConstraintCodePostalFr;
/**
 * Annotation pour les codes postaux.
 * @author cunvoas
 */
@Documented
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Constraint(validatedBy = ConstraintCodePostalFr.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface CodePostalFr {
  
  String message() default "{codepostal.fr.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
