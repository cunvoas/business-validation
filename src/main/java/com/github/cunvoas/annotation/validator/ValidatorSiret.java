package com.github.cunvoas.annotation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.github.cunvoas.annotation.Siret;
import com.github.cunvoas.validation.ValidationSirenSiret;

/**
 * Impl de la contrainte d'annotation : SIRET.
 * @author cunvoas
 */
public class ValidatorSiret implements ConstraintValidator<Siret, String> {


  /**
   * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
   */
  @Override
  public void initialize(Siret value) {
    // nothing to do
  }

  /**
   * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
   */
  @Override
  public boolean isValid(String value, ConstraintValidatorContext ctx) {
    boolean ret = ValidationSirenSiret.isSiret(value);
    return ret;
  }
}
