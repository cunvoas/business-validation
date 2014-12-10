package com.github.cunvoas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.github.cunvoas.annotation.common.TestEmail;
import com.github.cunvoas.annotation.locale.fr.TestNir;
import com.github.cunvoas.annotation.locale.fr.TestSiren;
import com.github.cunvoas.annotation.locale.fr.TestSiret;
import com.github.cunvoas.bcel.TestBcel;
import com.github.cunvoas.constraint.checkdigit.TestLuhnValidator;
import com.github.cunvoas.internal.locale.be.codepostal.TestCodePostalBeRepository;
import com.github.cunvoas.internal.locale.fr.codepostal.TestCodePostalFrRepository;
import com.github.cunvoas.internal.locale.fr.cog.TestCogLoader;
import com.github.cunvoas.validator.locale.fr.TestValidationNir;

@RunWith(Suite.class)
@SuiteClasses({
	TestEmail.class, 
	TestNir.class,
	TestSiren.class, 
	TestSiret.class , 
	TestCodePostalBeRepository.class,
	TestCodePostalFrRepository.class,
	TestCogLoader.class,
	TestValidationNir.class,
	TestLuhnValidator.class,
	TestBcel.class
})
public class AllTests {

}
