package com.github.cunvoas.constraint.common;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.github.cunvoas.annotation.common.Email;
import com.github.cunvoas.validator.ValidatorRule;
import com.github.cunvoas.validator.common.ValidatorEmail;
import com.github.cunvoas.validator.locale.be.ValidatorCodePostalBe;

/**
 * Impl de la contrainte d'annotation : email.
 * 
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
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object,
	 *      javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		boolean ret = false;
		if (StringUtils.isNotEmpty(value)) {
			ValidatorRule rule = new ValidatorEmail();
			ret = rule.isValid(value);
		} else {
			ret = true;
		}
		return ret;

	}
}
