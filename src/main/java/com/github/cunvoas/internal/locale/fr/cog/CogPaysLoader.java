package com.github.cunvoas.internal.locale.fr.cog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.cunvoas.internal.util.CsvLine;
import com.github.cunvoas.internal.util.CsvLineToSkip;
import com.github.cunvoas.internal.util.CsvLoader;

/**
 * Read codePostal.csv file.
 * @author cunvoas
 */
class CogPaysLoader extends CsvLoader implements CogConstants{
	private int year = DEFAULT_YEAR;
	private static final Logger LOGGER = LoggerFactory.getLogger(CogPaysLoader.class);
	private List<CsvLineToSkip> skipped = new ArrayList<CsvLineToSkip>();
	
	public CogPaysLoader() {
		super();
		skipped.add(new CsvLineToSkip(0, DOM_TOM_COG));
		skipped.add(new CsvLineToSkip(1, FIRST_LINE_WITH_LABEL));
	}
	
	protected Set<String> getCogSet() {
		Set<String> set = new HashSet<String>();
		
		List<CsvLine> codes = getList();
		for (CsvLine code : codes) {
			set.add( ((CogPaysLigne)code).getCog() );
		}
		return set;
	}
	
	/**
	 * COG	ACTUAL	CAPAY	CRPAY	ANI	LIBCOG	LIBENR	ANCNOM
	 * @see com.github.cunvoas.internal.util.CsvLoader#map(java.lang.String[])
	 */
	public CsvLine map(String[] cols) {
		CogPaysLigne cog = new CogPaysLigne();
		try {
			cog.setCog(cols[0]);
			cog.setActual(cols[1]);
			cog.setCapay(cols[2]);
			cog.setCrpay(cols[3]);
			cog.setAni(cols[4]);
			cog.setLibcog(cols[5]);
			cog.setLibenr(cols[6]);
			cog.setAncnom(cols[7]);
		} catch (ArrayIndexOutOfBoundsException ignore) {
			LOGGER.debug(ignore.getMessage());
		}
		return cog;
	}

	/**
	 * @see com.github.cunvoas.internal.util.CsvLoader#getFileResource()
	 */
	@Override
	public String getFileResource() {
		return "locale/fr/cog/pays" + year + ".txt";
	}

	/**
	 * @see com.github.cunvoas.internal.util.CsvLoader#getCsvSeparator()
	 */
	@Override
	public String getCsvSeparator() {
		return "\\t";
	}

	/**
	 * @see com.github.cunvoas.internal.util.CsvLoader#skip()
	 */
	@Override
	public List<CsvLineToSkip> skip() {
		return skipped;
	}

	/**
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
}
