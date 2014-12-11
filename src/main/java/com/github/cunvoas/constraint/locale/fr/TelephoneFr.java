package com.github.cunvoas.constraint.locale.fr;

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
/**
 * n° de téléphone Français Annotation.
 * @author cunvoas
 */
@Documented
@Pattern(regexp="^((([+]33)|(0)|([[+]33\\(0\\)]))(\\d{9}))$")
@Constraint(validatedBy={})
@Target( { FIELD, ANNOTATION_TYPE, PARAMETER } )
@Retention( RUNTIME )
public @interface TelephoneFr {
  
  String message() default "{constraint.fr.telephone.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
