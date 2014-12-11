package com.github.cunvoas.bcel;

import javax.validation.constraints.NotNull;

import com.github.cunvoas.annotation.common.bank.IBAN;
import com.github.cunvoas.annotation.common.bank.Visa;
import com.github.cunvoas.annotation.common.barcode.EAN13;
import com.github.cunvoas.annotation.common.barcode.EAN8;
import com.github.cunvoas.annotation.common.barcode.ISBN;
import com.github.cunvoas.annotation.common.barcode.SSCC;
import com.github.cunvoas.annotation.locale.fr.Siren;
import com.github.cunvoas.annotation.locale.fr.Siret;
import com.github.cunvoas.annotation.locale.fr.TelephoneFr;

public class BcelPojo {
	@NotNull
	private String notNull;

	@IBAN(mandatory=false)
	private String iban;
	
	@EAN13
	private String ean13;
	
	@EAN8
	private String ean8;
	
	@ISBN
	private String isbn;

	@Visa
	private String visacard;

	@SSCC
	private String sscc;
	
	@Siret
	private String siret;
	
	@Siren
	private String siren;
	
	@TelephoneFr
	private String telephoneFr;

	
	/**
	 * Getter for iban.
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * Setter for iban.
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/**
	 * Getter for ean.
	 * @return the ean
	 */
	public String getEan13() {
		return ean13;
	}

	/**
	 * Setter for ean.
	 * @param ean the ean to set
	 */
	public void setEan13(String ean) {
		this.ean13 = ean;
	}

	/**
	 * Getter for visacard.
	 * @return the visacard
	 */
	public String getVisacard() {
		return visacard;
	}

	/**
	 * Setter for visacard.
	 * @param visacard the visacard to set
	 */
	public void setVisacard(String visacard) {
		this.visacard = visacard;
	}

	/**
	 * Getter for notNull.
	 * @return the notNull
	 */
	public String getNotNull() {
		return notNull;
	}

	/**
	 * Setter for notNull.
	 * @param notNull the notNull to set
	 */
	public void setNotNull(String notNull) {
		this.notNull = notNull;
	}

	/**
	 * Getter for ean8.
	 * @return the ean8
	 */
	public String getEan8() {
		return ean8;
	}

	/**
	 * Setter for ean8.
	 * @param ean8 the ean8 to set
	 */
	public void setEan8(String ean8) {
		this.ean8 = ean8;
	}

	/**
	 * Getter for isbn.
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Setter for isbn.
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Getter for sscc.
	 * @return the sscc
	 */
	public String getSscc() {
		return sscc;
	}

	/**
	 * Setter for sscc.
	 * @param sscc the sscc to set
	 */
	public void setSscc(String sscc) {
		this.sscc = sscc;
	}

	/**
	 * Getter for siret.
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}

	/**
	 * Setter for siret.
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}

	/**
	 * Getter for siren.
	 * @return the siren
	 */
	public String getSiren() {
		return siren;
	}

	/**
	 * Setter for siren.
	 * @param siren the siren to set
	 */
	public void setSiren(String siren) {
		this.siren = siren;
	}

	/**
	 * Getter for telephoneFr.
	 * @return the telephoneFr
	 */
	public String getTelephoneFr() {
		return telephoneFr;
	}

	/**
	 * Setter for telephoneFr.
	 * @param telephoneFr the telephoneFr to set
	 */
	public void setTelephoneFr(String telephoneFr) {
		this.telephoneFr = telephoneFr;
	}


	
}
