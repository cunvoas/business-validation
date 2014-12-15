package com.github.cunvoas.validator.locale.fr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestValidationNir {

	private ValidatorNir tested = new ValidatorNir();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheksum() {
		Assert.assertTrue("hazard", tested.cheksum("155072900199917"));
	}

	@Test
	public void testIsValid() {
		Assert.assertTrue("hazard", tested.isValid("155072900199917"));
	}

}
