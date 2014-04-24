/**
 * 
 */
package com.github.cunvoas.cog;

import java.io.Serializable;

/**
 * @author CUNVOAS
 */
public class COG implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = -6126281336571022467L;
	
	private String actual;
	private String cheflieu;
	private String cdc;
	private String rang;
	private String reg;
	private String dep;
	private String com;
	private String ar;
	private String ct;
	private String modif;
	private String pole;
	private String tncc;
	private String artmaj;
	private String ncc;
	private String artmin;
	private String nccenr;
	private String articlct;
	private String nccct;
	
	
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
	 * Getter for cheflieu.
	 * @return the cheflieu
	 */
	public String getCheflieu() {
		return cheflieu;
	}
	/**
	 * Setter for cheflieu.
	 * @param cheflieu the cheflieu to set
	 */
	public void setCheflieu(String cheflieu) {
		this.cheflieu = cheflieu;
	}
	/**
	 * Getter for cdc.
	 * @return the cdc
	 */
	public String getCdc() {
		return cdc;
	}
	/**
	 * Setter for cdc.
	 * @param cdc the cdc to set
	 */
	public void setCdc(String cdc) {
		this.cdc = cdc;
	}
	/**
	 * Getter for rang.
	 * @return the rang
	 */
	public String getRang() {
		return rang;
	}
	/**
	 * Setter for rang.
	 * @param rang the rang to set
	 */
	public void setRang(String rang) {
		this.rang = rang;
	}
	/**
	 * Getter for reg.
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * Setter for reg.
	 * @param reg the reg to set
	 */
	public void setReg(String reg) {
		this.reg = reg;
	}
	/**
	 * Getter for dep.
	 * @return the dep
	 */
	public String getDep() {
		return dep;
	}
	/**
	 * Setter for dep.
	 * @param dep the dep to set
	 */
	public void setDep(String dep) {
		this.dep = dep;
	}
	/**
	 * Getter for com.
	 * @return the com
	 */
	public String getCom() {
		return com;
	}
	/**
	 * Setter for com.
	 * @param com the com to set
	 */
	public void setCom(String com) {
		this.com = com;
	}
	/**
	 * Getter for ar.
	 * @return the ar
	 */
	public String getAr() {
		return ar;
	}
	/**
	 * Setter for ar.
	 * @param ar the ar to set
	 */
	public void setAr(String ar) {
		this.ar = ar;
	}
	/**
	 * Getter for ct.
	 * @return the ct
	 */
	public String getCt() {
		return ct;
	}
	/**
	 * Setter for ct.
	 * @param ct the ct to set
	 */
	public void setCt(String ct) {
		this.ct = ct;
	}
	/**
	 * Getter for modif.
	 * @return the modif
	 */
	public String getModif() {
		return modif;
	}
	/**
	 * Setter for modif.
	 * @param modif the modif to set
	 */
	public void setModif(String modif) {
		this.modif = modif;
	}
	/**
	 * Getter for pole.
	 * @return the pole
	 */
	public String getPole() {
		return pole;
	}
	/**
	 * Setter for pole.
	 * @param pole the pole to set
	 */
	public void setPole(String pole) {
		this.pole = pole;
	}
	/**
	 * Getter for tncc.
	 * @return the tncc
	 */
	public String getTncc() {
		return tncc;
	}
	/**
	 * Setter for tncc.
	 * @param tncc the tncc to set
	 */
	public void setTncc(String tncc) {
		this.tncc = tncc;
	}
	/**
	 * Getter for artmaj.
	 * @return the artmaj
	 */
	public String getArtmaj() {
		return artmaj;
	}
	/**
	 * Setter for artmaj.
	 * @param artmaj the artmaj to set
	 */
	public void setArtmaj(String artmaj) {
		this.artmaj = artmaj;
	}
	/**
	 * Getter for ncc.
	 * @return the ncc
	 */
	public String getNcc() {
		return ncc;
	}
	/**
	 * Setter for ncc.
	 * @param ncc the ncc to set
	 */
	public void setNcc(String ncc) {
		this.ncc = ncc;
	}
	/**
	 * Getter for artmin.
	 * @return the artmin
	 */
	public String getArtmin() {
		return artmin;
	}
	/**
	 * Setter for artmin.
	 * @param artmin the artmin to set
	 */
	public void setArtmin(String artmin) {
		this.artmin = artmin;
	}
	/**
	 * Getter for nccenr.
	 * @return the nccenr
	 */
	public String getNccenr() {
		return nccenr;
	}
	/**
	 * Setter for nccenr.
	 * @param nccenr the nccenr to set
	 */
	public void setNccenr(String nccenr) {
		this.nccenr = nccenr;
	}
	/**
	 * Getter for articlct.
	 * @return the articlct
	 */
	public String getArticlct() {
		return articlct;
	}
	/**
	 * Setter for articlct.
	 * @param articlct the articlct to set
	 */
	public void setArticlct(String articlct) {
		this.articlct = articlct;
	}
	/**
	 * Getter for nccct.
	 * @return the nccct
	 */
	public String getNccct() {
		return nccct;
	}
	/**
	 * Setter for nccct.
	 * @param nccct the nccct to set
	 */
	public void setNccct(String nccct) {
		this.nccct = nccct;
	}

	/**
	 * Getter for Commune.
	 * @return the commune
	 */
	public String getCommune() {
		StringBuilder sb = new StringBuilder();
		return sb.append(getDep()).append(getCom()).toString();
	}
	

}
