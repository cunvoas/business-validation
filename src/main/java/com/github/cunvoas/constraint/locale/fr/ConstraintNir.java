package com.github.cunvoas.constraint.locale.fr;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.github.cunvoas.annotation.locale.fr.NIR;
import com.github.cunvoas.validator.ValidatorRule;
import com.github.cunvoas.validator.locale.fr.ValidatorNir;

/**
 * Impl de la contrainte d'annotation : NIR.
 * @author cunvoas
 */
public class ConstraintNir implements ConstraintValidator<NIR, String> {


  /**
   * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
   */
  @Override
  public void initialize(NIR value) {
    // nothing to do
  }

  /**
   * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
   */
  @Override
  public boolean isValid(String value, ConstraintValidatorContext ctx) {

		boolean ret = false;
		if (StringUtils.isNotEmpty(value)) {
			ValidatorRule rule = new ValidatorNir();
			ret = rule.isValid(value);
		} else {
			ret = true;
		}
		return ret;
  }
}
