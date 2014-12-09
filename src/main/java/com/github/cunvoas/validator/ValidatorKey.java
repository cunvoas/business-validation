package com.github.cunvoas.validator;

public interface ValidatorKey {
	
	/**
	 * Compute validation key.
	 * @param value
	 * @return
	 */
	String getKey(String value);
}
