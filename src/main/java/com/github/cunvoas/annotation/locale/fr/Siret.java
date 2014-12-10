package com.github.cunvoas.annotation.locale.fr;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

import com.github.cunvoas.annotation.checkdigit.Luhn;
/**
 * SIRET Annotation.
 * @author cunvoas
 */
@Documented
@Luhn
@Pattern(regexp="^(\\d{14})$")
@Constraint(validatedBy={})
@Target( { FIELD, ANNOTATION_TYPE, PARAMETER } )
@Retention( RUNTIME )
public @interface Siret {
  
  String message() default "{constraint.fr.siret.message}";
  
  Class<?>[] groups() default {};
  
  boolean mandatory() default false;
  
  Class<? extends Payload>[] payload() default {};
}
