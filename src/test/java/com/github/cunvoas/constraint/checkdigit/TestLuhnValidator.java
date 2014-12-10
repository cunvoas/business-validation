package com.github.cunvoas.constraint.checkdigit;

import org.junit.Assert;
import org.junit.Test;

public class TestLuhnValidator {
	private LuhnValidator tested = new LuhnValidator();


	@Test
	public void testWeightedValue() {
		
		try {
			Assert.assertEquals("poid impair 9", 7, tested.weightedValue(7, 1, 9) );
			Assert.assertEquals("poid pair   8", 6, tested.weightedValue(3, 2, 8) );
			Assert.assertEquals("poid impair 7", 2, tested.weightedValue(2, 3, 7) );
			Assert.assertEquals("poid pair   6", 7, tested.weightedValue(8, 4, 6) );
			Assert.assertEquals("poid impair 5", 2, tested.weightedValue(2, 5, 5) );
			Assert.assertEquals("poid pair   4", 9, tested.weightedValue(9, 6, 4) );
			Assert.assertEquals("poid impair 3", 3, tested.weightedValue(3, 7, 3) );
			Assert.assertEquals("poid pair   2", 4, tested.weightedValue(2, 8, 2) );
			Assert.assertEquals("poid impair 1", 0, tested.weightedValue(0, 9, 1) );
			
			//  972-487-086
			Assert.assertEquals("poid impair 9", 9, tested.weightedValue(9, 1, 9) );
			Assert.assertEquals("poid pair   7", 5, tested.weightedValue(7, 2, 8) );
			Assert.assertEquals("poid impair 2", 2, tested.weightedValue(2, 3, 7) );
			Assert.assertEquals("poid pair   4", 8, tested.weightedValue(4, 4, 6) );
			Assert.assertEquals("poid impair 8", 8, tested.weightedValue(8, 5, 5) );
			Assert.assertEquals("poid pair   7", 5, tested.weightedValue(7, 6, 4) );
			Assert.assertEquals("poid impair 0", 0, tested.weightedValue(0, 7, 3) );
			Assert.assertEquals("poid pair   8", 7, tested.weightedValue(8, 8, 2) );
			Assert.assertEquals("poid impair 6", 6, tested.weightedValue(6, 9, 1) );
			
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
	}

	@Test
	public void testIsValid() {
		Assert.assertTrue("SIREN", tested.isValid("732829320",null));
		Assert.assertTrue("SIRET", tested.isValid("73282932000074",null));
		

		Assert.assertTrue("SIREN", tested.isValid("443177233",null));
		Assert.assertTrue("SIRET", tested.isValid("44317723300022",null));
		
		Assert.assertTrue("SIREN", tested.isValid("777344623",null));
		Assert.assertTrue("SIRET", tested.isValid("77734462300023",null));
		
		Assert.assertTrue("SIREN", tested.isValid("753444892",null));
		Assert.assertTrue("SIRET", tested.isValid("75344489200016",null));
		
		Assert.assertTrue("SIREN", tested.isValid("395085913",null));
		Assert.assertTrue("SIRET", tested.isValid("39508591300030",null));
		
		Assert.assertTrue("SIREN", tested.isValid("438276180",null));
		Assert.assertTrue("SIRET", tested.isValid("43827618000017",null));
		
		Assert.assertTrue("SIREN", tested.isValid("317480135",null));
		Assert.assertTrue("SIRET", tested.isValid("31748013500035",null));
		
	}
	

	@Test
	public void testGetKey() {
		Assert.assertEquals("SIREN 732829320", "0", tested.getKey("73282932"));
		Assert.assertEquals("SIRET 73282932000074", "4", tested.getKey("7328293200007"));
		
		Assert.assertEquals("SIREN 44317723", "3", tested.getKey("44317723"));
		Assert.assertEquals("SIRET 44317723300022", "2", tested.getKey("4431772330002"));
		
		Assert.assertEquals("SIREN 44317723", "2", tested.getKey("75344489"));
		Assert.assertEquals("SIRET 44317723300022", "6", tested.getKey("7534448920001"));
		
		Assert.assertEquals("SIREN 395085913", "3", tested.getKey("39508591"));
		Assert.assertEquals("SIRET 39508591300030", "0", tested.getKey("3950859130003"));
		
		Assert.assertEquals("SIREN 438276180", "0", tested.getKey("43827618"));
		Assert.assertEquals("SIRET 43827618000017", "7", tested.getKey("4382761800001"));
		
		Assert.assertEquals("SIREN 317480135", "5", tested.getKey("31748013"));
		Assert.assertEquals("SIRET 31748013500035", "5", tested.getKey("3174801350003"));

		
	}

}
