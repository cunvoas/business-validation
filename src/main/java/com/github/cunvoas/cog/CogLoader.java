/**
 * 
 */
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
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CUNVOAS
 */
class CogLoader {
	private static final int DEFAULT_YEAR = 2014;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CogLoader.class);

	protected static List<COG> getCogs() {
		return getCogs(DEFAULT_YEAR);
	}

	protected static List<COG> getCogs(int year) {
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
				String[] cols = line.split("\\t");
				cogs.add(map(cols));
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
	private static COG map(String[] cols) {
		COG cog = new COG();
		cog.setActual(Integer.parseInt(cols[0]));
		cog.setCheflieu(Integer.parseInt(cols[1]));
		cog.setCdc(Integer.parseInt(cols[2]));
		cog.setRang(Integer.parseInt(cols[3]));
		cog.setReg(Integer.parseInt(cols[4]));
		cog.setDep(Integer.parseInt(cols[5]));
		cog.setCom(Integer.parseInt(cols[6]));
		cog.setAr(Integer.parseInt(cols[7]));
		cog.setCt(Integer.parseInt(cols[8]));
		cog.setModif(Integer.parseInt(cols[9]));
		cog.setPole(Integer.parseInt(cols[10]));
		cog.setTncc(Integer.parseInt(cols[11]));
		cog.setArtmaj(cols[12]);
		cog.setNcc(cols[13]);
		cog.setArtmin(cols[14]);
		cog.setNccenr(cols[15]);
		cog.setArticlct(cols[16]);
		cog.setNccct(cols[17]);
		return cog;
	}
}
