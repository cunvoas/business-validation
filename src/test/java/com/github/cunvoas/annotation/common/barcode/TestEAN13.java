package com.github.cunvoas.annotation.common.barcode;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.cunvoas.annotation.FakePojo;

public class TestEAN13 {

	private static Validator validator;

	@Test
	public final void testInitialize() {
		// nothing to test
		Assert.assertFalse(false);
	}

	@BeforeClass
	public static void setUpA() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public final void testEAN13() {
		FakePojo pojo = new FakePojo();

		pojo.setEan13("3268840001008");

		Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);
		Assert.assertEquals("ean13 valide", 0, constraintViolations.size());
	}
	

	@Test
	public final void testFindEAN13() {
		DecimalFormat df = new DecimalFormat("000");
		FakePojo pojo = new FakePojo();
		
		int nbMatch=0;
		for (int i=0;i<1000;i++) {
			pojo.setEan13(String.format("%s8840001008", df.format(i)));
			
			Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);
			if (constraintViolations.size()==0) {
				//System.out.println(pojo.getEan13());
				nbMatch++;
			}
		}

		Assert.assertEquals("nb ean13 cohérent", (int)Math.pow(10, df.format(5).length()-1), nbMatch);

	}

}
