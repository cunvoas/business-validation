package com.github.cunvoas.validator.locale.be;

import com.github.cunvoas.internal.locale.be.codepostal.CodePostalBeRepository;
import com.github.cunvoas.validator.ValidatorRule;


/**
 * @author cunvoas
 */
public class ValidatorCodePostalBe implements ValidatorRule {

        
    private static final String REGEXP_BASIC="^[0-9L]{1}[0-9]{3}$";
	
	/**
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(String value) {
		boolean ret = false;
		
		// check basic regexp
		ret = value!=null && value.matches(REGEXP_BASIC);
		if (ret) {
			ret = CodePostalBeRepository.getInstance().checkCodePostal(value);
		}
		
		
		return ret;
	}
}
