package com.github.cunvoas.constraint.locale.fr;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestSirenSiretValidator {
	
	private SirenSiretValidator tested = new SirenSiretValidator();

	@Test
	public void testWeightedValue() {
		
		try {
			Assert.assertEquals("poid impair 9",  7, tested.weightedValue(7, 1, 9) );
			Assert.assertEquals("poid pair   8",  6, tested.weightedValue(3, 2, 8) );
			Assert.assertEquals("poid impair 7",  2, tested.weightedValue(2, 3, 7) );
			Assert.assertEquals("poid pair   6", 16, tested.weightedValue(8, 4, 6) );

			Assert.assertEquals("poid impair 5",  2, tested.weightedValue(2, 5, 5) );
			Assert.assertEquals("poid pair   4", 18, tested.weightedValue(9, 6, 4) );
			Assert.assertEquals("poid impair 3",  3, tested.weightedValue(3, 7, 3) );
			Assert.assertEquals("poid pair   2",  4, tested.weightedValue(2, 8, 2) );
			Assert.assertEquals("poid impair 1",  0, tested.weightedValue(0, 9, 1) );
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
	}

	@Test
	public void testIsValid() {
		Assert.assertTrue("SIREN", tested.isValid("732829320",null));
		Assert.assertTrue("SIRET", tested.isValid("73282932000074",null));

		Assert.assertTrue("SIREN", tested.isValid("317480135",null));
		Assert.assertTrue("SIRET", tested.isValid("31748013500035",null));
		
	}

}
