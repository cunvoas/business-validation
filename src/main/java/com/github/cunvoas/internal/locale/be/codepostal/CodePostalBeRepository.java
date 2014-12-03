package com.github.cunvoas.internal.locale.be.codepostal;

import java.util.Set;

/**
 * Repository for COG.
 * @author Christophe UNVOAS
 * @see http://en.wikipedia.org/wiki/Singleton_pattern#Initialization_On_Demand_Holder_Idiom
 */
public class CodePostalBeRepository {

	// Private constructor prevents instantiation from other classes
	private CodePostalBeRepository() {
		super();
		codes = (new CodePostalBeLoader()).getCodePostalSet();
	}
	private static Set<String> codes=null;
	private static final int CODE_LEN=4;
	
	/**
	* SingletonHolder is loaded on the first execution of Singleton.getInstance() 
	* or the first access to SingletonHolder.INSTANCE, not before.
	*/
	private static class CodePostalRepositoryHolder { 
		private static final CodePostalBeRepository INSTANCE = new CodePostalBeRepository();
	}
 
	/**
	 * Instance is load only on demand.
	 * @return instance of the singleton.
	 */
	public static CodePostalBeRepository getInstance() {
		return CodePostalRepositoryHolder.INSTANCE;
	}
	

	/**
	 * check validity of the cog (only for current or ancient city, not by date).
	 * @param cog
	 * @return
	 */
	public boolean checkCodePostal(String code) {
		boolean ret=false;
		if (code!=null && code.length()==CODE_LEN) {
			ret = codes.contains(code);
		}
		return ret;
	}

}
