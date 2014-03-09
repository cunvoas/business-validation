package com.github.cunvoas.validation;

/**
 * Interface for rule validation.
 * @author cunvoas
 */
public interface ValidationRule {
	
	/**
	 * Check validity.
	 * @param value
	 * @return
	 */
	boolean isValid(String value);
}
