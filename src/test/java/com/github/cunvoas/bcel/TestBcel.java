package com.github.cunvoas.bcel;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Size;

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

//  @Test
//  public final void testEan13() {
//    BcelPojo pojo = new BcelPojo();
//    pojo.setEan(null);//"3020120012018");
//    
//    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
//    Assert.assertEquals(1, constraintViolations.size());
//  }


  @Test
  public final void testIBAN() {
    BcelPojo pojo = new BcelPojo();
    pojo.setIban("BE43068999999501");
    
    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
    pojo.setIban("BE43068999999502");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
  }


//  @Test
//  public final void testVisa() {
//    BcelPojo pojo = new BcelPojo();
//    pojo.setVisacard("5555555555554444");
//    
//    Set<ConstraintViolation<BcelPojo>> constraintViolations = validator.validate(pojo);
//    Assert.assertEquals(1, constraintViolations.size());
//    
//    pojo.setVisacard("4556169897304682");
//    constraintViolations = validator.validate(pojo);
//    Assert.assertEquals(1, constraintViolations.size());
//    
//    pojo.setVisacard("4556169897304683");
//    constraintViolations = validator.validate(pojo);
//    Assert.assertEquals(2, constraintViolations.size());
//    
//  }

}
