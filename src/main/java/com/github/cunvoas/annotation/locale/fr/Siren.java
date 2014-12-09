package com.github.cunvoas.annotation.locale.fr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.github.cunvoas.constraint.locale.fr.ConstraintSiren;
/**
 * SIREN Annotation.
 * @author cunvoas
 */
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ConstraintSiren.class)
public @interface Siren {
  
  String message() default "{constraint.fr.siren.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
