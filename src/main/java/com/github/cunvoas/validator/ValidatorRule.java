package com.github.cunvoas.validator;

/**
 * Interface for rule validation.
 * @author cunvoas
 */
public interface ValidatorRule {
	
	/**
	 * Check validity.
	 * @param value
	 * @return
	 */
	boolean isValid(String value);
}
