package com.github.cunvoas.validator.locale.fr;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.github.cunvoas.validator.locale.fr.ValidatorSirenSiret;

/**
 * TU du helper SIREN/SIRET.
 * @author cunvoas
 */
public class TestValidationSirenSiret {
	
	// SOCIETE / SIRET / SIREN
	private String[][] data = {
			{"EMPEIRIA", "47806487600020", "478064876"},
			{"INFOTEL",  "31748013500035", "317480135"},
			{"NATIXIS",  "37915536900083", "379155369"}
		};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsSiren() {

		for (String[] line : data) {
			String testVal = line[2];
			
			Assert.assertTrue(testVal, ValidatorSirenSiret.isSiren(testVal));
		}
	}

	@Test
	public void testIsSiret() {

		for (String[] line : data) {
			String testVal = line[1];
			
			Assert.assertTrue(testVal, ValidatorSirenSiret.isSiret(testVal));
		}
	}

}
