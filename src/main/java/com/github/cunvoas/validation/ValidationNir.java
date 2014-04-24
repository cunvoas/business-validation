/**
 * 
 */
package com.github.cunvoas.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.github.cunvoas.annotation.NIR;
import com.github.cunvoas.cog.CogRepository;


/**
 * @author CUNVOAS
 * @see http://fr.wikipedia.org/wiki/Num%C3%A9ro_de_s%C3%A9curit%C3%A9_sociale_en_France
 */
public class ValidationNir implements ConstraintValidator<NIR, String> {
	
    private static final long MODULUS = 97;

    private static final String CORSE_CODE_A = "A";
    private static final String CORSE_CODE_B = "B";
    private static final int CORSE_OFFSET_A = -1000000;
    private static final int CORSE_OFFSET_B = -2000000;
        
    private static final String REGEXP_BASIC="^[1-478]{1}[0-9]{5}[0-9AB]{1}[0-9]{8}$";
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean ret = false;
		
		// check basic regexp
		ret = value!=null && value.matches(REGEXP_BASIC);
		// check checksum
		if (ret) {
			ret = cheksum(value);
		}
		if (ret) {
			String cog = value.substring(5, 10);
			ret = CogRepository.getInstance().checkFr(cog);
		}
		
		
		return ret;
	}

	@Override
	public void initialize(NIR constraintAnnotation) {
		//notting to do
	}
	
	/**
	 * @param value
	 * @return
	 */
	protected boolean cheksum(String value) {
		
		long base = Long.parseLong(value.substring(0, 13).replaceAll("[AB]", "0"));
		if (value.indexOf(CORSE_CODE_A)>0) {
			base+=CORSE_OFFSET_A;
		} else if (value.indexOf(CORSE_CODE_B)>0) {
			base+=CORSE_OFFSET_B;
		}
		
		int key = Integer.parseInt(value.substring(13));
        return (MODULUS - base % MODULUS) == key;
	}


}
