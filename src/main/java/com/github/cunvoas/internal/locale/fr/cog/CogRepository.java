package com.github.cunvoas.internal.locale.fr.cog;

import java.util.Set;

/**
 * Repository for COG.
 * @author Christophe UNVOAS
 * @see http://en.wikipedia.org/wiki/Singleton_pattern#Initialization_On_Demand_Holder_Idiom
 */
public class CogRepository {

	// Private constructor prevents instantiation from other classes
	private CogRepository() {
		super();
		cogLoader = new CogLoader();
		cogPaysLoader = new CogPaysLoader();
		
		cogs = cogLoader.getCogSet();
		cogs.addAll(cogPaysLoader.getCogSet());
	}
	private static Set<String> cogs=null;
	private static final int COG_LEN=5;
	private static CogLoader cogLoader = null;
	private static CogPaysLoader cogPaysLoader = null;
	
	private int cogYear=CogConstants.DEFAULT_YEAR;
	
	/**
	* SingletonHolder is loaded on the first execution of Singleton.getInstance() 
	* or the first access to SingletonHolder.INSTANCE, not before.
	*/
	private static class CogRepositoryHolder { 
		private static final CogRepository INSTANCE = new CogRepository();
	}
 
	/**
	 * Instance is load only on demand.
	 * @return instance of the singleton.
	 */
	public static CogRepository getInstance() {
		return CogRepositoryHolder.INSTANCE;
	}
	
	/**
	 * Change year from COG check.
	 * @param year
	 */
	public synchronized void setYear(int year) {
		if (cogYear!=year) {
			cogLoader.setYear(year);
			cogPaysLoader.setYear(year);
			
			cogs.clear();
			cogs.addAll(cogLoader.getCogSet());
			cogs.addAll(cogPaysLoader.getCogSet());
			cogYear=year;
		}
	}
	
	/**
	 * check validity of the cog (only for current or ancient city, not by date).
	 * @param cog
	 * @return
	 */
	public boolean checkCog(String cog) {
		boolean ret=false;
		if (cog!=null && cog.length()==COG_LEN) {
			ret = cogs.contains(cog);
		}
		return ret;
	}

}
