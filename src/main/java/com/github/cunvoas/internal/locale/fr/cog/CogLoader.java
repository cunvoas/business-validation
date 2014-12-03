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
 * Read france{YYYY}.txt file.
 * @author cunvoas
 */
class CogLoader extends CsvLoader implements CogConstants {

	private int year = DEFAULT_YEAR;
	private List<CsvLineToSkip> skipped = new ArrayList<CsvLineToSkip>();
	private static final Logger LOGGER = LoggerFactory.getLogger(CogLoader.class);

	public CogLoader() {
		super();
		skipped.add(new CsvLineToSkip(0, FIRST_LINE_WITH_LABEL));
	}

	/**
	 * @return default 
	 */
	public Set<String> getCogSet() {
		Set<String> cogs = new HashSet<String>();
		
		List<CsvLine> cogFrLignes = getList();
		for (CsvLine cogLigne : cogFrLignes) {
			cogs.add(((CogLigne)cogLigne).getCog());
		}

		return cogs;
	}

	/**
	 * @see com.github.cunvoas.internal.util.CsvLoader#getFileResource()
	 */
	@Override
	public String getFileResource() {
		return "locale/fr/cog/france" + year + ".txt";
	}

	/**
	 * @see com.github.cunvoas.internal.util.CsvLoader#getCsvSeparator()
	 */
	@Override
	public String getCsvSeparator() {
		return "\\t";
	}



	/**
	 * ACTUAL CHEFLIEU CDC RANG REG DEP COM AR CT MODIF POLE TNCC ARTMAJ NCC ARTMIN NCCENR ARTICLCT NCCCT
	 * @see com.github.cunvoas.internal.util.CsvLoader#map(java.lang.String[])
	 */
	@Override
	public CsvLine map(String[] cols) {
		CogLigne cog = new CogLigne();
		try {
			cog.setActual(cols[0]);
			cog.setCheflieu(cols[1]);
			cog.setCdc(cols[2]);
			cog.setRang(cols[3]);
			cog.setReg(cols[4]);
			cog.setDep(cols[5]);
			cog.setCom(cols[6]);
			cog.setAr(cols[7]);
			cog.setCt(cols[8]);
			cog.setModif(cols[9]);
			cog.setPole(cols[10]);
			cog.setTncc(cols[11]);
			cog.setArtmaj(cols[12]);
			cog.setNcc(cols[13]);
			cog.setArtmin(cols[14]);
			cog.setNccenr(cols[15]);
			cog.setArticlct(cols[16]);
			cog.setNccct(cols[17]);
		} catch (ArrayIndexOutOfBoundsException ignore) {
			LOGGER.debug(ignore.getMessage());
		}
		return cog;
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
