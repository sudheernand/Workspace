package com.indus.training.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.entity.SalesManager;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDAO;

public class TestEmployeeDAO {
	private EmployeeDAO empDAOObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		empDAOObj = new EmployeeDAO();
	}

	@After
	public void tearDown() throws Exception {
		empDAOObj = null;
	}

	@Test
	public void testSelect() throws PersistException {
		Employee actualempObj;

		actualempObj = empDAOObj.select(149);
		System.out.println(actualempObj);

	}

}