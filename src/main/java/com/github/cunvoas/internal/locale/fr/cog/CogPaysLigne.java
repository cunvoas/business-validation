package com.github.cunvoas.internal.locale.fr.cog;

import com.github.cunvoas.internal.util.CsvLine;

/**
 * BO représentant une ligne du fichier des Codes Officiels Géographiques des pays étrangés.
 * @author cunvoas
 * @see http://www.insee.fr/fr/methodes/nomenclatures/cog/
 * @see http://www.insee.fr/fr/methodes/default.asp?page=nomenclatures/cog/doc_fpays.htm
 */
class CogPaysLigne implements CsvLine {

	/** serialVersionUID. */
	private static final long serialVersionUID = -3909035853296765873L;
	
	
	private String cog;
	private String actual;
	private String capay;
	private String crpay;
	private String ani;
	private String libcog;
	private String libenr;
	private String ancnom;
	/**
	 * Getter for cog.
	 * @return the cog
	 */
	public String getCog() {
		return cog;
	}
	/**
	 * Setter for cog.
	 * @param cog the cog to set
	 */
	public void setCog(String cog) {
		this.cog = cog;
	}
	/**
	 * Getter for actual.
	 * @return the actual
	 */
	public String getActual() {
		return actual;
	}
	/**
	 * Setter for actual.
	 * @param actual the actual to set
	 */
	public void setActual(String actual) {
		this.actual = actual;
	}
	/**
	 * Getter for capay.
	 * @return the capay
	 */
	public String getCapay() {
		return capay;
	}
	/**
	 * Setter for capay.
	 * @param capay the capay to set
	 */
	public void setCapay(String capay) {
		this.capay = capay;
	}
	/**
	 * Getter for crpay.
	 * @return the crpay
	 */
	public String getCrpay() {
		return crpay;
	}
	/**
	 * Setter for crpay.
	 * @param crpay the crpay to set
	 */
	public void setCrpay(String crpay) {
		this.crpay = crpay;
	}
	/**
	 * Getter for ani.
	 * @return the ani
	 */
	public String getAni() {
		return ani;
	}
	/**
	 * Setter for ani.
	 * @param ani the ani to set
	 */
	public void setAni(String ani) {
		this.ani = ani;
	}
	/**
	 * Getter for libcog.
	 * @return the libcog
	 */
	public String getLibcog() {
		return libcog;
	}
	/**
	 * Setter for libcog.
	 * @param libcog the libcog to set
	 */
	public void setLibcog(String libcog) {
		this.libcog = libcog;
	}
	/**
	 * Getter for libenr.
	 * @return the libenr
	 */
	public String getLibenr() {
		return libenr;
	}
	/**
	 * Setter for libenr.
	 * @param libenr the libenr to set
	 */
	public void setLibenr(String libenr) {
		this.libenr = libenr;
	}
	/**
	 * Getter for ancnom.
	 * @return the ancnom
	 */
	public String getAncnom() {
		return ancnom;
	}
	/**
	 * Setter for ancnom.
	 * @param ancnom the ancnom to set
	 */
	public void setAncnom(String ancnom) {
		this.ancnom = ancnom;
	}
	
	
	
}
