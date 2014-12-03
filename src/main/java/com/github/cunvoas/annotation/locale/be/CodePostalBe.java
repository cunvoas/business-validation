package com.github.cunvoas.annotation.locale.be;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.github.cunvoas.constraint.locale.be.ConstraintCodePostalBe;
/**
 * Annotation pour les codes postaux.
 * @author cunvoas
 */
@Documented
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Constraint(validatedBy = ConstraintCodePostalBe.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface CodePostalBe {
  
  String message() default "{codepostal.be.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
