package com.github.cunvoas.annotation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.github.cunvoas.annotation.Siren;
import com.github.cunvoas.validation.ValidationSirenSiret;

/**
 * Impl de la contrainte d'annotation : SIREN.
 * @author cunvoas
 */
public class ValidatorSiren implements ConstraintValidator<Siren, String> {


  /**
   * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
   */
  @Override
  public void initialize(Siren value) {
    // nothing to do
  }

  /**
   * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
   */
  @Override
  public boolean isValid(String value, ConstraintValidatorContext ctx) {
    boolean ret = ValidationSirenSiret.isSiren(value);
    return ret;
  }
}
