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

    pojo.setNir("155072900199917");
    Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());

    pojo.setNir("155072900199918");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(1, constraintViolations.size());
  }

}
