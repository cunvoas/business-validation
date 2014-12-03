package com.github.cunvoas.internal.locale.fr.cog;


import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.github.cunvoas.internal.util.CsvLine;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCogLoader {
	
	private CogLoader cogLoader = new CogLoader();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test01_GetCogList() {
		List<CsvLine> cogs = cogLoader.getList();
		Assert.assertNotNull(cogs);
		Assert.assertEquals(40310, cogs.size());
	}


	@Test
	public void test03_GetCogSet() {
		Set<String> cogs = cogLoader.getCogSet();
		Assert.assertNotNull(cogs);
		Assert.assertEquals(39165, cogs.size());
	}


}
