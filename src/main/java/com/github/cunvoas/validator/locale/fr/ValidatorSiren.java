/**
 * 
 */
package com.github.cunvoas.validator.locale.fr;

import com.github.cunvoas.validator.ValidatorRule;

/**
 * @author cunvoas
 */
public class ValidatorSiren extends  ValidatorSirenSiret {

	/**
	 * @see com.github.cunvoas.validator.ValidatorRule#isValid(java.lang.String)
	 */
	@Override
	public boolean isValid(String value) {
		return super.isSiren(value);
	}

}
