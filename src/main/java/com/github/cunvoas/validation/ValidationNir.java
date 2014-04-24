/**
 * 
 */
package com.github.cunvoas.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.github.cunvoas.annotation.NIR;


/**
 * @author CUNVOAS
 * @see http://fr.wikipedia.org/wiki/Num%C3%A9ro_de_s%C3%A9curit%C3%A9_sociale_en_France
 */
public class ValidationNir implements ConstraintValidator<NIR, String> {
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void initialize(NIR constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}


}
