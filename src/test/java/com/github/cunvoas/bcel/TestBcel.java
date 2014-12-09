package com.github.cunvoas.bcel;

import java.util.Set;
import java.util.regex.Pattern;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBcel {

  private static Validator validator;

  @BeforeClass
  public static void setUp() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  @Test
  public final void testNotNull() {
    BcelPojo pojo = new BcelPojo();
    pojo.setNotNull("test");
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
  }

  @Test
  public final void testEan13() {
    BcelPojo pojo = new BcelPojo();
    pojo.setEan13(null);//"3020120012018");
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
    
    pojo.setEan13("3020120012018");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
    
    pojo.setEan13("47195127");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(2, constraintViolations.size());
    
  }


  @Test
  public final void testEan8() {
    BcelPojo pojo = new BcelPojo();
    pojo.setNotNull("test");
    pojo.setEan8(null);//"3020120012018");
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
    pojo.setEan8("47195127");//"3020120012018");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    

    pojo.setEan8("3020120012018");//"3020120012018");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
  }
  

  @Test
  public final void testSscc() {
    BcelPojo pojo = new BcelPojo();
    pojo.setNotNull("test");
    pojo.setSscc(null);
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
    pojo.setSscc("00123456789012345675");//"3020120012018");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
  }

  @Test
  public final void testIsbn() {
	 String pString = "^((97[89]){0,1}[0-9]{10})$";
	 Assert.assertTrue("regex 13 978", Pattern.matches(pString, "9781234567890"));
	 Assert.assertTrue("regex 13 979", Pattern.matches(pString, "9791234567890"));
	 Assert.assertTrue("regex 10", Pattern.matches(pString, "1234567890"));
	 
    BcelPojo pojo = new BcelPojo();
    pojo.setNotNull("test");
    pojo.setIsbn(null);
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    

    pojo.setIsbn("9782123456803");//"3020120012018");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());

    pojo.setIsbn("1234567895");//"3020120012018");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
  }


  @Test
  public final void testIBAN() {
    BcelPojo pojo = new BcelPojo();
    pojo.setNotNull("");
    pojo.setIban("BE43068999999501");
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
    pojo.setIban("BE43068999999502");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
  }


  @Test
  public final void testVisa() {
    BcelPojo pojo = new BcelPojo();
    pojo.setNotNull("");
    pojo.setVisacard("5555555555554444");
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
    
    pojo.setVisacard("4556169897304682");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
    pojo.setVisacard("4556169897304683");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
    
  }

  
  

}
