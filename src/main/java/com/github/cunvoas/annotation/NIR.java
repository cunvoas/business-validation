package com.github.cunvoas.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

import org.apache.bval.extras.constraints.checkdigit.Luhn;

import com.github.cunvoas.validation.ValidationNir;
/**
 * NIR Annotation.
 * @author cunvoas
 */
@Documented
@Luhn
@Pattern(regexp="^[1-478]{1}[0-9]{5}[0-9AB]{1}[0-9]{8}$")
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Constraint(validatedBy = ValidationNir.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NIR {
  
  String message() default "{nir.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
