package com.indus.training.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDAO;

public class TestEmployee {
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
		Employee actualempObj = new Employee();
		actualempObj = empDAOObj.select(100);
		System.out.println(actualempObj.getEmail());

		// try {
		// actualempObj = empDAOObj.select(100);
		// System.out.println(actualempObj);
		// Employee expempObj = new Employee();
		// expempObj.setFirstName("Steven");
		// expempObj.setLastName("King");
		// expempObj.setEmployeeId(100);
		// expempObj.setPhoneNumber("515.123.4567");
		// BigDecimal sal = new BigDecimal(24000);
		// expempObj.setDepartmentId(90);
		// expempObj.setSalary(sal);
		//
		// assertEquals(actualempObj, expempObj);
		//
		// } catch (PersistException e) {
		// e.printStackTrace();
		// }

	}
	//
	// @Test
	// public void testCreate() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testUpdate() {
	// fail("Not yet implemented");
	// }

}
