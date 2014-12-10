package com.github.cunvoas.annotation.locale.fr;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.cunvoas.annotation.FakePojo;

public class TestSiret {

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


    pojo.setSiret("478064876");
    Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());

    pojo.setSiret("47806487600020");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
  }

}
