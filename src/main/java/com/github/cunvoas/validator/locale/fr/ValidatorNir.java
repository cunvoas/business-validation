/**
 * 
 */
package com.github.cunvoas.validator.locale.fr;

import java.text.DecimalFormat;
import java.text.Format;

import org.apache.commons.lang3.StringUtils;

import com.github.cunvoas.internal.locale.fr.cog.CogRepository;
import com.github.cunvoas.validator.ChecksumProvider;
import com.github.cunvoas.validator.ValidatorRule;


/**
 * @author cunvoas
 * @see http://fr.wikipedia.org/wiki/Num%C3%A9ro_de_s%C3%A9curit%C3%A9_sociale_en_France
 */
public class ValidatorNir implements ValidatorRule, ChecksumProvider {
	
    private static final long MODULUS = 97;
    private static final long NIR_LEN = 15;

    private static final String CORSE_CODE_A = "A";
    private static final String CORSE_CODE_B = "B";
    private static final int CORSE_OFFSET_A = -1000000;
    private static final int CORSE_OFFSET_B = -2000000;
        
    private static final String REGEXP_BASIC="^[1-478]{1}[0-9]{5}[0-9AB]{1}[0-9]{8}$";
	
	/**
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(String value) {
		boolean ret = false;
		
		// check basic regexp
		ret = value!=null && value.matches(REGEXP_BASIC);
		// check checksum
		if (ret) {
			ret = cheksum(value);
		}
		if (ret) {
			String cog = value.substring(5, 10);
			if (!cog.startsWith("99")) {
				ret = CogRepository.getInstance().checkCog(cog);
			}
		}
		
		
		return ret;
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

	/**
	 * @see com.github.cunvoas.validator.ChecksumProvider#getKey(java.lang.String)
	 */
	@Override
	public String getKey(String value) {
		String key=null;
		if (StringUtils.isNotBlank(value) && NIR_LEN -2 == value.length()) {
			long base = Long.parseLong(value.replaceAll("[AB]", "0"));
			if (value.indexOf(CORSE_CODE_A)>0) {
				base+=CORSE_OFFSET_A;
			} else if (value.indexOf(CORSE_CODE_B)>0) {
				base+=CORSE_OFFSET_B;
			}
			
			long keyi = MODULUS - base % MODULUS;
			Format format = new DecimalFormat("#0");
			key = format.format(keyi);
		}
		return key;
	}


}
