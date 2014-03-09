package com.github.cunvoas.annotation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSiren {

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
    //pojo.setSiren("478064876");
    pojo.setSiret("47806487600020");
    pojo.setEmail("aa@aaa.fr");
    

    pojo.setSiren("47806487600020");
    Set<ConstraintViolation<FakePojo>> constraintViolations = validator.validate(pojo);

    Assert.assertEquals(1, constraintViolations.size());
   // Assert.assertEquals("Veuillez saisir une adresse email valide.", constraintViolations.iterator().next());

    pojo.setSiren("478064876");
    constraintViolations = validator.validate(pojo);
    Assert.assertEquals(0, constraintViolations.size());
    
  }

}
