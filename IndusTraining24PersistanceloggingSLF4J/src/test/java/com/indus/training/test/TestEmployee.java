package com.indus.training.test;

import java.math.BigDecimal;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDAO;

import junit.framework.TestCase;

public class TestEmployee extends TestCase {
	private EmployeeDAO empDAOObj;

	protected void setUp() throws Exception {
		empDAOObj = new EmployeeDAO();
	}

	protected void tearDown() throws Exception {
		empDAOObj = null;
	}

	public void testSelectUI() throws PersistException {

		Employee actualempObj = empDAOObj.select(167);
		System.out.println(actualempObj);
		Employee expempObj = new Employee();
		expempObj.setFirstName("steven");
		expempObj.setLastName("king");
		expempObj.setEmployeeId(167);
		expempObj.setPhoneNumber("515.123.4567");
		expempObj.setJobID("AD_PRESS");
		BigDecimal sal = new BigDecimal(24000);
		expempObj.setSalary(sal);

		assertEquals(actualempObj, expempObj);

	}

}
