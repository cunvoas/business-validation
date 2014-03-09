package com.github.cunvoas.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.github.cunvoas.annotation.validator.ValidatorEmail;
/**
 * Email Annotation .
 * @author cunvoas
 * @see http://musingsofaprogrammingaddict.blogspot.fr/2009/02/getting-started-with-jsr-303-bean.html
 */
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidatorEmail.class)
public @interface Email {
  
  String message() default "{email.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
