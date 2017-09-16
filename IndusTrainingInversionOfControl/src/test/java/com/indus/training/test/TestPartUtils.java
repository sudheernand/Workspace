package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.utils.PartsUtil;

public class TestPartUtils {
	private PartsUtil partsObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		partsObj = PartsUtil.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		partsObj = null;
	}

	@Test
	public void testGetNewCar() {
		System.out.println(partsObj.getHondaCar());
		System.out.println(partsObj.getToyotaCar());

	}

}
