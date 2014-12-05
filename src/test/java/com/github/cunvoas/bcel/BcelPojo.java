package com.github.cunvoas.bcel;

import javax.validation.constraints.NotNull;

import com.github.cunvoas.annotation.common.bank.IBAN;
import com.github.cunvoas.annotation.common.bank.Visa;
import com.github.cunvoas.annotation.common.barcode.EAN13;



public class BcelPojo {
	@NotNull
	private String notNull;

	@IBAN(mandatory=false)
	private String iban;
	
	@EAN13
	private String ean;

	@Visa
	private String visacard;

	
	
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
	public String getEan() {
		return ean;
	}

	/**
	 * Setter for ean.
	 * @param ean the ean to set
	 */
	public void setEan(String ean) {
		this.ean = ean;
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
	
	
}