package com.github.cunvoas.constraint.locale.fr;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.github.cunvoas.annotation.locale.fr.Siren;
import com.github.cunvoas.validator.ValidatorRule;
import com.github.cunvoas.validator.locale.fr.ValidatorSiren;

/**
 * Impl de la contrainte d'annotation : SIREN.
 * @author cunvoas
 */
public class ConstraintSiren implements ConstraintValidator<Siren, String> {


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
		boolean ret = false;
		if (StringUtils.isNotEmpty(value)) {
			ValidatorRule rule = new ValidatorSiren();
			ret = rule.isValid(value);
		} else {
			ret = true;
		}
		return ret;
		
  }
}
