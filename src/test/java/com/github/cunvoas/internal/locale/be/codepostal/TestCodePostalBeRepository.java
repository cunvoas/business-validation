package com.github.cunvoas.internal.locale.be.codepostal;

import org.junit.Assert;
import org.junit.Test;

public class TestCodePostalBeRepository {

	@Test
	public void testCheckCodePostal() {
		Assert.assertTrue("BRUXELLE", CodePostalBeRepository.getInstance().checkCodePostal("1000"));
		Assert.assertFalse("NOT EXIST", CodePostalBeRepository.getInstance().checkCodePostal("9999"));
		Assert.assertFalse("TOO SHORT", CodePostalBeRepository.getInstance().checkCodePostal("999"));
		Assert.assertFalse("TOO LONG", CodePostalBeRepository.getInstance().checkCodePostal("10000"));
	}

}
