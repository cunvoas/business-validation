package com.github.cunvoas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.github.cunvoas.annotation.TestEmail;
import com.github.cunvoas.annotation.TestSiren;
import com.github.cunvoas.annotation.TestSiret;
import com.github.cunvoas.validation.TestValidationSirenSiret;

@RunWith(Suite.class)
@SuiteClasses({
	TestValidationSirenSiret.class,
	TestEmail.class, 
	TestSiren.class, 
	TestSiret.class 
})
public class AllTests {

}
