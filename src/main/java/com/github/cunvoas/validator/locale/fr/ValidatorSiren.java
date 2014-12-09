/**
 * 
 */
package com.github.cunvoas.validator.locale.fr;


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

	@Override
	public String getKey(String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
