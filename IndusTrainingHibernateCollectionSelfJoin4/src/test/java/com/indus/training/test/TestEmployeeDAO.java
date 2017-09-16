package com.indus.training.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.persist.entity.Employee;

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
	public void testSelect() {
		Employee actualempObj;
		try {
			actualempObj = empDAOObj.select(106);
			System.out.println("fdfd");
			// Name nameObj = new Name();
			System.out.println(actualempObj.toString());
			// Employee expempObj = new Employee();
			// nameObj.setFirstName("steven");
			// nameObj.setLastName("king");
			// expempObj.setFullName(nameObj);
			//
			// expempObj.setEmployeeId(167);
			// expempObj.setPhoneNumber("515.123.4567");
			// expempObj.setJobID("AD_PRESS");
			// BigDecimal sal = new BigDecimal(24000);
			// expempObj.setSalary(sal);

			// assertEquals(actualempObj, expempObj);

		} catch (PersistException e) {
			e.printStackTrace();
		}

	}

}