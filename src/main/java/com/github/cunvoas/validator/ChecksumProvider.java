package com.github.cunvoas.validator;

public interface ChecksumProvider {
	
	/**
	 * Compute validation key.
	 * @param value
	 * @return
	 */
	String getKey(String value);
}
