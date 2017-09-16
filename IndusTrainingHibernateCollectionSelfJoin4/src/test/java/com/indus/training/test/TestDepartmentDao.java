package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.persist.entity.Department;
import com.indus.training.persist.impl.DepartmentDAO;

public class TestDepartmentDao {
	private DepartmentDAO depDAOObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		depDAOObj = new DepartmentDAO();
	}

	@After
	public void tearDown() throws Exception {
		depDAOObj = null;
	}

	@Test
	public void testSelect() {
		Department exDepDAOObj = depDAOObj.select(60);
		System.out.println(exDepDAOObj.getEmployees());

	}

}
