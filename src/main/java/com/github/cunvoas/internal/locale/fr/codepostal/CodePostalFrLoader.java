package com.github.cunvoas.internal.locale.fr.codepostal;

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
class CodePostalFrLoader extends CsvLoader {
	private static final Logger LOGGER = LoggerFactory.getLogger(CodePostalFrLoader.class);

	
	protected Set<String> getCodePostalSet() {
		Set<String> set = new HashSet<String>();
		
		List<CsvLine> codes = getList();
		for (CsvLine code : codes) {
			set.add( ((CodePostalFrLigne)code).getCode() );
		}
		return set;
	}
	
	/**
	 * ACTUAL CHEFLIEU CDC RANG REG DEP COM AR CT MODIF POLE TNCC ARTMAJ NCC ARTMIN NCCENR ARTICLCT NCCCT
	 * @see com.github.cunvoas.internal.util.CsvLoader#map(java.lang.String[])
	 */
	public CsvLine map(String[] cols) {
		CodePostalFrLigne line = new CodePostalFrLigne();
		try {
			line.setRegion(cols[0]);
			line.setVille(cols[1]);
			line.setCode(cols[2]);
		} catch (ArrayIndexOutOfBoundsException ignore) {
			LOGGER.debug(ignore.getMessage());
		}
		return line;
	}

	/**
	 * @see com.github.cunvoas.internal.util.CsvLoader#getFileResource()
	 */
	@Override
	public String getFileResource() {
		return "locale/fr/codePostal.csv";
	}

	/**
	 * @see com.github.cunvoas.internal.util.CsvLoader#getCsvSeparator()
	 */
	@Override
	public String getCsvSeparator() {
		return "\\t";
	}

	@Override
	public List<CsvLineToSkip> skip() {
		return null;
	}
}
