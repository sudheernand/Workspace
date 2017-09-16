package com.indus.training.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.indus.training.persist.entity.Department;
import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistanceException;
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

		Employee actualempObj = null;
		try {
			actualempObj = empDAOObj.select(100);
			System.out.println(actualempObj);
			Employee expempObj = new Employee();
			expempObj.setFirstName("Steven");
			expempObj.setLastName("king");
			expempObj.setEmployeeId(100);
			expempObj.setPhoneNumber("515.123.4567");
			BigDecimal sal = new BigDecimal(24000);
			expempObj.setSalary(sal);
			System.out.println(expempObj);
			assertEquals(expempObj.getFirstName(), actualempObj.getFirstName());
		} catch (PersistanceException e) {
			e.printStackTrace();
		}

	}
	//
	// @Test
	// public void testCreate() {
	// Employee actualEmpObj = null;
	// try {
	// actualEmpObj = empDAOObj.select(116);
	//
	// actualEmpObj.setCommissionPct(new BigDecimal(0.10));
	// actualEmpObj.setEmail("myemai3lwfwd");
	// actualEmpObj.setEmployeeId(28);
	// actualEmpObj.setFirstName("Deodcw");
	// actualEmpObj.setLastName("drewed");
	// // Department dpObj = new Department();
	// // dpObj.setDepartmentId(60);
	// // actualEmpObj.setDepartment(dpObj);
	// // Job jobObj = new Job();
	// // jobObj.setJobId("IT_PROG");
	// // actualEmpObj.setJob(jobObj);
	//
	// actualEmpObj.setSalary(new BigDecimal(8000));
	// System.out.println(actualEmpObj);
	//
	// empDAOObj.create(actualEmpObj);
	//
	// } catch (PersistanceException e) {
	// e.printStackTrace();
	// }
	// }

	// @Test
	// public void testUpdate() {
	// Employee actualEmpObj = null;
	// try {
	// actualEmpObj = empDAOObj.select(14);
	//
	// actualEmpObj.setCommissionPct(new BigDecimal(0.10));
	// actualEmpObj.setEmail("myemai3lwfwd");
	// actualEmpObj.setFirstName("NewDeodcwwde");
	// actualEmpObj.setLastName("drewed");
	// // Department dpObj = new Department();
	// // dpObj.setDepartmentId(60);
	// // actualEmpObj.setDepartment(dpObj);
	// // Job jobObj = new Job();
	// // jobObj.setJobId("IT_PROG");
	// // actualEmpObj.setJob(jobObj);
	//
	// actualEmpObj.setSalary(new BigDecimal(8000));
	// System.out.println(actualEmpObj);
	//
	// empDAOObj.update(actualEmpObj);
	//
	// } catch (PersistanceException e) {
	// e.printStackTrace();
	// }
	//
	// }
}

// @Test
// public void testDelete() {
// }
