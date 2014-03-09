package com.github.cunvoas.annotation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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

    pojo.setEmail("aa@aaa.fr");
    
    Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals("email valide", 0, constraintViolations.size());

    pojo.setEmail("aa@xx.xx");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals("authorite invalide", 1, constraintViolations.size());
    
    // domaine de 63 => ok
    pojo.setEmail("aa@123456789012345678901234567890123456789012345678901234567890123.fr");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals("domaine nom maxi invalide", 0, constraintViolations.size());
    
    // domaine de 64 => ko
    pojo.setEmail("aa@1234567890123456789012345678901234567890123456789012345678901234.fr");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals("domaine trop long invalide", 1, constraintViolations.size());
  }

}
