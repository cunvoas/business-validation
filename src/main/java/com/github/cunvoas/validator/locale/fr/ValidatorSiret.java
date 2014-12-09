package com.github.cunvoas.validator.locale.fr;


/**
 * @author cunvoas
 */
public class ValidatorSiret extends  ValidatorSirenSiret {

	/**
	 * @see com.github.cunvoas.validator.ValidatorRule#isValid(java.lang.String)
	 */
	@Override
	public boolean isValid(String value) {
		return super.isSiret(value);
	}

	@Override
	public String getKey(String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
