package com.github.cunvoas.internal.locale.fr.codepostal;

import com.github.cunvoas.internal.util.CsvLine;

/**
 * BO représentant une ligne du fichier des codes postaux.
 * @author cunvoas
 */
class CodePostalFrLigne implements CsvLine {

	/** serialVersionUID. */
	private static final long serialVersionUID = 978656854227204595L;
	
	private String region;
	private String ville;
	private String code;
	
	/**
	 * Getter for region.
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * Setter for region.
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * Getter for ville.
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * Setter for ville.
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * Getter for code.
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * Setter for code.
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CodePostalFrLigne)) {
			return false;
		}
		CodePostalFrLigne other = (CodePostalFrLigne) obj;
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		return true;
	}
}
