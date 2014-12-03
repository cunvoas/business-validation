package com.github.cunvoas.constraint.locale.be;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.github.cunvoas.annotation.locale.be.CodePostalBe;
import com.github.cunvoas.validator.ValidatorRule;
import com.github.cunvoas.validator.locale.be.ValidatorCodePostalBe;

/**
 * Impl de la contrainte d'annotation : COG.
 * 
 * @author cunvoas
 */
public class ConstraintCodePostalBe implements ConstraintValidator<CodePostalBe, String> {

	/**
	 * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
	 */
	@Override
	public void initialize(CodePostalBe value) {
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
			ValidatorRule rule = new ValidatorCodePostalBe();
			ret = rule.isValid(value);
		} else {
			ret = true;
		}
		return ret;
	}
}
