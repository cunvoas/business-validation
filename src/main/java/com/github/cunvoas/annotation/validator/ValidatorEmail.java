package com.github.cunvoas.annotation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.github.cunvoas.annotation.Email;
import com.github.cunvoas.validation.ValidationEmail;
import com.github.cunvoas.validation.ValidationRule;

/**
 * Impl de la contrainte d'annotation : email.
 * @author cunvoas
 */
public class ValidatorEmail implements ConstraintValidator<Email, String> {

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
	ValidationRule rule = new ValidationEmail();
    boolean ret = rule.isValid(value);
    return ret;
  }
}
