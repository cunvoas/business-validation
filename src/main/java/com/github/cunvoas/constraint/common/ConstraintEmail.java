package com.github.cunvoas.constraint.common;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.github.cunvoas.annotation.common.Email;
import com.github.cunvoas.validator.ValidatorRule;
import com.github.cunvoas.validator.common.ValidatorEmail;

/**
 * Impl de la contrainte d'annotation : email.
 * @author cunvoas
 */
public class ConstraintEmail implements ConstraintValidator<Email, String> {

  /**
   * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
   */
  @Override
  public void initialize(Email value) {
    // nothing to do
  }

  /**
   * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
   */
  @Override
  public boolean isValid(String value, ConstraintValidatorContext ctx) {
	ValidatorRule rule = new ValidatorEmail();
    boolean ret = rule.isValid(value);
    return ret;
  }
}
