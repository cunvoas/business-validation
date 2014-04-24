package com.github.cunvoas.annotation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestNir {

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


    pojo.setSiret("175052211303794");
    Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());

    pojo.setSiret("175052211303795");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
  }

}
