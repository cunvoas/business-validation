package com.github.cunvoas.annotation.locale.fr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.github.cunvoas.constraint.locale.fr.ConstraintSiret;
/**
 * SIRET Annotation.
 * @author cunvoas
 */
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ConstraintSiret.class)
public @interface Siret {
  
  String message() default "{siret.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}