package com.github.cunvoas.annotation.common;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.cunvoas.annotation.FakePojo;

public class TestEmail {

  private static Validator validator;

  @Test
  public final void testInitialize() {
    // nothing to test
    Assert.assertFalse(false);
  }

  @BeforeClass
  public static void setUp() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  @Test
  public final void testIsValid() {
    FakePojo pojo = new FakePojo();
    pojo.setSiren("478064876");
    pojo.setSiret("47806487600020");
    pojo.setNir("155072900199917");

    pojo.setEmail("aa@aaa.fr");
    
    Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals("email valide", 0, constraintViolations.size());

    pojo.setEmail("aa@xx.xx");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals("authorite invalide", 1, constraintViolations.size());
    
//    // domaine de < 2533 => ok
    String domain = "12345678901234567890123456789012345678901234567890" + 
    		"12345678901234567890123456789012345678901234567890" +
    		"12345678901234567890123456789012345678901234567890" + 
    		"12345678901234567890123456789012345678901234567890" + 
    		"12345678901234567890123456789012345678901234567890" + 
    		"12";
    		
    pojo.setEmail("aa@"+ domain +".fr");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals("domaine nom maxi invalide", 0, constraintViolations.size());
    
    // domaine de 253 => ko
    pojo.setEmail("aa@"+ domain +"1.fr");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals("domaine trop long invalide", 1, constraintViolations.size());
  }

}
