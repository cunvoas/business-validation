package com.github.cunvoas.cog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CUNVOAS
 */
class CogLoader {
	protected static final int DEFAULT_YEAR = 2014;
	private static final String FIRST_LINE_WITH_LABEL = "ACTUAL";
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CogLoader.class);

	protected static List<COG> getCogList() {
		return getCogList(DEFAULT_YEAR);
	}

	protected static List<COG> getCogList(int year) {
		List<COG> cogs = new ArrayList<COG>();

		String fileName = null;
		InputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url = Thread.currentThread().getContextClassLoader().getResource("cog/france" + year + ".txt");
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
				
				String[] cols = line.split("\\t");
				if (!FIRST_LINE_WITH_LABEL.equals(cols[0])) {
					cogs.add(mapFr(cols));
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

		return cogs;
	}
	
	/**
	 * @return default 
	 */
	protected static Set<String> getCogSet() {
		return getCogSet(DEFAULT_YEAR);
	}
	
	/**
	 * @param year
	 * @return
	 */
	protected static Set<String> getCogSet(int year) {
		Set<String> cogs = new HashSet<String>();

		String fileName = null;
		InputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url = Thread.currentThread().getContextClassLoader().getResource("cog/france" + year + ".txt");
			fileName = url.getPath();
			File file = new File(fileName);
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			String line = br.readLine();
			while (line != null) {
				String[] cols = line.split("\\t");
				if (!FIRST_LINE_WITH_LABEL.equals(cols[0])) {
					COG cog = mapFr(cols);
					cogs.add(cog.getCommune());
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

		return cogs;
	}

	/**
	 * 
	 * ACTUAL CHEFLIEU CDC RANG REG DEP COM AR CT MODIF POLE TNCC ARTMAJ NCC
	 * ARTMIN NCCENR ARTICLCT NCCCT
	 * 
	 * @param cols
	 * @return
	 */
	private static COG mapFr(String[] cols) {
		COG cog = new COG();
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
}
