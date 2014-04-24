package com.github.cunvoas.annotation;


class FakePojo {

	@Email
	private String email;

	@Siren
	private String siren;

	@Siret
	private String siret;
	
	@NIR
	private String nir;
	
	/**
	 * @return the siren
	 */
	public String getSiren() {
		return siren;
	}

	/**
	 * Setter for siren.
	 * 
	 * @param siren
	 *            the siren to set
	 */
	public void setSiren(String siren) {
		this.siren = siren;
	}

	/**
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}

	/**
	 * Setter for siret.
	 * 
	 * @param siret
	 *            the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}


	/**
	 * Getter for email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter for email.
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter for  nir.
	 * @return the nir
	 */
	public String getNir() {
		return nir;
	}

	/**
	 * Setter for  nir.
	 * @param nir the nir to set
	 */
	public void setNir(String nir) {
		this.nir = nir;
	}
}
