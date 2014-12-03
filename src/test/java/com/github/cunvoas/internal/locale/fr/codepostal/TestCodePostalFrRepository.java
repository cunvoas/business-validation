package com.github.cunvoas.internal.locale.fr.codepostal;

import org.junit.Assert;
import org.junit.Test;

public class TestCodePostalFrRepository {
	
	

	@Test
	public void testCheckCodePostal() {
		Assert.assertTrue("LANNION", CodePostalFrRepository.getInstance().checkCodePostal("22300") );
		Assert.assertTrue("TREBEURDEN", CodePostalFrRepository.getInstance().checkCodePostal("22560") );
		Assert.assertFalse("! LILLE", CodePostalFrRepository.getInstance().checkCodePostal("59801") );
	}

}
