package com.github.cunvoas.validator.locale.fr;

import org.apache.commons.lang3.StringUtils;

import com.github.cunvoas.validator.ValidatorKey;
import com.github.cunvoas.validator.ValidatorRule;

/**
 * @author cunvoas
 * @see http://codes-sources.commentcamarche.net/source/42857-verification-de-la-validite-des-codes-siret-et-siren
 */
public abstract class ValidatorSirenSiret implements ValidatorRule, ValidatorKey {

	private static final String SIREN_REGEX= "\\d{9}";
	private static final String SIRET_REGEX= "\\d{14}";
	
	/**
	 * Détermine si le siren est valide.
	 * @param siren a tester
	 * @return
	 */
	public static boolean isSiren(String siren) {
		boolean valid = false;
		int total = 0;
		int digit = 0;

		if ( StringUtils.isNotBlank(siren)  && siren.matches(SIREN_REGEX)) {
			int len = siren.length();
			for (int i = 0; i < len; i++) {
				/**
				 * Recherche les positions paires : 2ème, 4ème, 6ème et 8ème chiffre
				 * que l'on multiplie par 2
				 * 
				 * petite différence avec la définition ci-dessus car ici on travail
				 * de gauche à droite
				 */
	
				if ((i % 2) == 1) {
					digit = Integer.parseInt(String.valueOf(siren.charAt(i))) * 2;
					/**
					 * si le résultat est >9 alors il est composé de deux digits
					 * tous les digits devant
					 * 
					 * s'additionner et ne pouvant être >19 le calcule devient : 1 +
					 * (digit -10) ou : digit - 9
					 */
	
					if (digit > 9)
						digit -= 9;
				} else {
					digit = Integer.parseInt(String.valueOf(siren.charAt(i)));
				}
				total += digit;
			}
	
			/** Si la somme est un multiple de 10 alors le SIREN est valide */
			valid = ((total % 10) == 0);
		}
		return valid;
	}

	/**
	 * Détermine si le siret est valide.
	 * @param siret
	 * @return
	 */
	public static boolean isSiret(String siret) {
		boolean valid=false;
		int total = 0;
		int digit = 0;

		if ( StringUtils.isNotBlank(siret)  && siret.matches(SIRET_REGEX)) {
			int len = siret.length();
			for (int i = 0; i < len; i++) {
				/**
				 * Recherche les positions impaires : 1er, 3è, 5è, etc... que l'on
				 * multiplie par 2
				 * 
				 * petite différence avec la définition ci-dessus car ici on travail
				 * de gauche à droite
				 */
	
				if ((i % 2) == 0) {
					digit = Integer.parseInt(String.valueOf(siret.charAt(i))) * 2;
					/**
					 * si le résultat est >9 alors il est composé de deux digits
					 * tous les digits devant
					 * 
					 * s'additionner et ne pouvant être >19 le calcule devient : 1 +
					 * (digit -10) ou : digit - 9
					 */
	
					if (digit > 9)
						digit -= 9;
				} else {
					digit = Integer.parseInt(String.valueOf(siret.charAt(i)));
				}
				total += digit;
			}
			/** Si la somme est un multiple de 10 alors le SIRET est valide */
			valid =  (total % 10) == 0;
		}
		return valid;
	}
}
