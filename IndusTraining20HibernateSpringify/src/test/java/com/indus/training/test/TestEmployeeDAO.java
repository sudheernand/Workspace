package com.indus.training.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDAO;
import com.indus.training.persist.service.IEmployeeDAO;

public class TestEmployeeDAO {
	private IEmployeeDAO empDAOObj;
	private static ApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[] { "HibernateSpringifyIoc.xml" });
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		empDAOObj = (IEmployeeDAO) context.getBean("employeeDAOBean");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelect() throws PersistException {

		Employee empObj = empDAOObj.select(167);
		System.out.println(empObj);
		
		// Employee expempObj = new Employee();
		// expempObj.setFirstName("steven");
		// expempObj.setLastName("king");
		// expempObj.setEmployeeId(167);
		// expempObj.setPhoneNumber("515.123.4567");
		// expempObj.setJobID("AD_PRESS");
		// BigDecimal sal = new BigDecimal(24000);
		// expempObj.setSalary(sal);
		//
		// assertEquals(actualempObj, expempObj);

	}

	// @Test
	// public void testCreate() {
	// fail("Not yet implemented");
	// }

	// @Test
	// public void testUpdate() {
	// fail("Not yet implemented");
	// }

}
