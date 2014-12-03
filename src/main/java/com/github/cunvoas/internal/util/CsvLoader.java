package com.github.cunvoas.internal.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Read CSV file.
 * @author cunvoas
 */
public abstract class CsvLoader {
	private static final Logger LOGGER = LoggerFactory.getLogger(CsvLoader.class);
	
	public abstract String getFileResource();
	public abstract String getCsvSeparator();
	public abstract CsvLine map(String[] cols);
	public abstract List<CsvLineToSkip> skip();

	/**
	 * Read codePostal.csv file.
	 * @param year
	 * @return
	 */
	public List<CsvLine> getList() {
		List<CsvLine> codes= new ArrayList<CsvLine>();

		String fileName = null;
		InputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url = Thread.currentThread().getContextClassLoader().getResource(getFileResource());
			fileName = url.getPath();
			File file = new File(fileName);
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			String line = br.readLine();
			while (line != null) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(line);
				}
				
				String[] cols = line.split(getCsvSeparator());
				if (!toBeSkipped(cols)) {
					codes.add(map(cols));
				}
				
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			LOGGER.error(e.getMessage());
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
			
		} finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					LOGGER.debug(e.getMessage());
				}
			}
			
			if (isr!=null) {
				try {
					isr.close();
				} catch (IOException e) {
					LOGGER.debug(e.getMessage());
				}
			}
			
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					LOGGER.debug(e.getMessage());
				}
			}
		}

		return codes;
	}
	
	/**
	 * @param cols
	 * @return TRUE if line be skipped.
	 */
	private boolean toBeSkipped(String[] cols) {
		boolean ret = false;
		if (skip()!=null) {
			for (Iterator<CsvLineToSkip> iterator = skip().iterator(); iterator.hasNext() && !ret;) {
				CsvLineToSkip skipPrm = iterator.next();
				ret =  skipPrm.getValue().equals(cols[skipPrm.getPosition()]);
			}
		}
		return ret;
	}
	
}
