package com.indus.training.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.persist.entity.Country;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.CountryDAO;

public class TestCountryDAO {
	private CountryDAO conDAOObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		conDAOObj = new CountryDAO();
	}

	@After
	public void tearDown() throws Exception {
		conDAOObj = null;
	}

	@Test
	public void testSelect() throws PersistException {
		Country conObj = new Country();

		conObj = conDAOObj.select("IT");
		System.out.println(conObj.getLocations());

	}

}
