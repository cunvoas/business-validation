/**
 * 
 */
package com.github.cunvoas.validator.locale.fr;

import com.github.cunvoas.internal.locale.fr.codepostal.CodePostalFrRepository;
import com.github.cunvoas.validator.ValidatorRule;


/**
 * @author cunvoas
 */
public class ValidatorCodePostalFr implements ValidatorRule {

        
    private static final String REGEXP_BASIC="^[0-9]{1}[0-9AB]{1}[0-9]{3}$";
	
	/**
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(String value) {
		boolean ret = false;
		
		// check basic regexp
		ret = value!=null && value.matches(REGEXP_BASIC);
		if (ret) {
			ret = CodePostalFrRepository.getInstance().checkCodePostal(value);
		}
		
		
		return ret;
	}
}
