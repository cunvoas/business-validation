package com.github.cunvoas.constraint.locale.fr;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.github.cunvoas.annotation.locale.fr.Siret;
import com.github.cunvoas.validator.ValidatorRule;
import com.github.cunvoas.validator.locale.fr.ValidatorSiret;

/**
 * Impl de la contrainte d'annotation : SIRET.
 * @author cunvoas
 */
public class ConstraintSiret implements ConstraintValidator<Siret, String> {


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
		boolean ret = false;
		if (StringUtils.isNotEmpty(value)) {
			ValidatorRule rule = new ValidatorSiret();
			ret = rule.isValid(value);
		} else {
			ret = true;
		}
		return ret;
  }
}
