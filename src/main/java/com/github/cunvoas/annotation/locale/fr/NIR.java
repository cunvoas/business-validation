package com.github.cunvoas.annotation.locale.fr;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.github.cunvoas.constraint.locale.fr.ConstraintNir;
import com.github.cunvoas.validator.locale.fr.ValidatorNir;
/**
 * NIR Annotation.
 * WARNING : if you use NIR in your application your need to respect CNIL law.
 * @see http://fr.wikipedia.org/wiki/Loi_informatique_et_libert%C3%A9s_du_6_janvier_1978
 * @author cunvoas
 */
@Documented
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Constraint(validatedBy = ConstraintNir.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface NIR {
  
  String message() default "{constraint.fr.nir.message}";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
