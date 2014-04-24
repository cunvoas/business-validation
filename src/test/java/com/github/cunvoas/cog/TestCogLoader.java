package com.github.cunvoas.cog;


import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCogLoader {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test01_GetCogList() {
		List<COG> cogs = CogLoader.getCogList();
		Assert.assertNotNull(cogs);
		Assert.assertEquals(40310, cogs.size());
	}

	@Test
	public void test02_GetCogListInt() {
		List<COG> cogs = CogLoader.getCogList(2014);
		Assert.assertNotNull(cogs);
		Assert.assertEquals(40310, cogs.size());
	}

	@Test
	public void test03_GetCogSet() {
		Set<String> cogs = CogLoader.getCogSet();
		Assert.assertNotNull(cogs);
		Assert.assertEquals(39165, cogs.size());
	}

	@Test
	public void test04_GetCogSetInt() {
		Set<String> cogs = CogLoader.getCogSet(2014);
		Assert.assertNotNull(cogs);
		Assert.assertEquals(39165, cogs.size());
	}

}
