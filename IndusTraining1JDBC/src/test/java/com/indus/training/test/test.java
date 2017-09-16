package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.persist.exception.EmployeeDAOException;
import com.indus.training.ui.EmployeeUI;

public class test {
	private EmployeeUI uiObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		uiObj = new EmployeeUI();
	}

	@After
	public void tearDown() throws Exception {
		uiObj = null;
	}

	@Test
	public void testCrudOptionss() {
		try {
			uiObj.crudOptionss();
		} catch (EmployeeDAOException e) {
			e.printStackTrace();
		}

	}

}
