/**
 * 
 */
package com.github.cunvoas.validation;

/**
 * @author cunvoas
 */
public class ValidationSiren extends  ValidationSirenSiret {

	/**
	 * @see com.github.cunvoas.validation.ValidationRule#isValid(java.lang.String)
	 */
	@Override
	public boolean isValid(String value) {
		return super.isSiren(value);
	}

}
