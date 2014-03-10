package com.github.cunvoas.validation;

import org.apache.commons.lang3.StringUtils;


/**
 * @author cunvoas
 * @see http://tools.ietf.org/html/rfc5321
 * @see http://isemail.info/about
 */
public class ValidationEmail implements ValidationRule {
	
	private static final String EMAIL_REGEX = "^([\\w-\\.]{1,64}@[\\w-]{1,64}\\.(aero|asia|biz|bzh|cat|com|coop|edu|gov|gouv|info|int|jobs|mil|mobi|museum|name|net|org|paris|pro|sport|tel|travel|xxx|ac|ad|ae|af|ag|ai|al|am|an|ao|aq|ar|as|at|au|aw|ax|az|ba|bb|bd|be|bf|bg|bh|bi|bj|bm|bn|bo|br|bs|bt|bw|by|bz|ca|cc|cd|cf|cg|ch|ci|ck|cl|cm|cn|co|cr|cu|cv|cx|cy|cz|de|dj|dk|dm|do|dz|ec|ee|eg|er|es|et|eu|fi|fj|fk|fm|fo|fr|ga|gd|ge|gf|gg|gh|gi|gl|gm|gn|gp|gq|gr|gs|gt|gu|gw|gy|hk|hm|hn|hr|ht|hu|id|ie|il|im|in|io|iq|ir|is|it|je|jm|jo|jp|ke|kg|kh|ki|km|kn|kp|kr|kw|ky|kz|la|lb|lc|li|lk|lr|ls|lt|lu|lv|ly|ma|mc|md|me|mg|mh|mk|ml|mm|mn|mo|mp|mq|mr|ms|mt|mu|mv|mw|mx|my|mz|na|nc|ne|nf|ng|ni|nl|no|np|nr|nu|nz|om|pa|pe|pf|pg|ph|pk|pl|pm|pn|pr|ps|pt|pw|py|qa|re|ro|rs|ru|rw|sa|sb|sc|sd|se|sg|sh|si|sk|sl|sm|sn|so|sr|ss|st|su|sv|sx|sy|sz|tc|td|tf|tg|th|tj|tk|tl|tm|tn|to|tp|tr|tt|tv|tw|tz|ua|ug|uk|us|uy|uz|va|vc|ve|vg|vi|vn|vu|wf|ws|ye|yt|za|zm|zw))?$";
	
	/**
	 * @see com.github.cunvoas.validation.ValidationRule#isValid(java.lang.String)
	 */
	public boolean isValid(String email) {
		boolean ret = false;
		if ( StringUtils.isNotBlank(email) ) {
			ret = email.matches(EMAIL_REGEX);
			
			
		}
		return ret;
	}
}
