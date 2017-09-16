package com.indus.training.test;

import java.math.BigDecimal;
import java.util.List;

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

	// @Test
	public void testRead() throws PersistException {
		Employee empObj = new Employee();
		empObj = empDAOObj.read(100);
		System.out.println(empObj);
	}

	// s@Test
	public void testReadUsingHQl() throws PersistException {
		List<Employee> listObj = null;

		listObj = empDAOObj.readUsingHQl(105, 160);
		for (Employee i : listObj) {
			System.out.println(i);
		}

	}

	@Test
	public void testReadUsingCriteria() throws PersistException {
		List<Employee> listObj = null;

		listObj = empDAOObj.readUsingCriteria(105, 160);
		for (Employee i : listObj) {
			System.out.println(i);
		}
	}

	// @Test
	public void testReadUsingNativeSQL() throws PersistException {
		List<Employee> listObj = null;
		listObj = empDAOObj.readUsingNativeSQL(105, 12000);
		for (Employee i : listObj) {
			System.out.println(i);
		}
	}

	// @Test
	public void testReadUsingNamedQuery() throws PersistException {
		List<Employee> listObj = null;
		listObj = empDAOObj.readUsingNamedQuery(105, 12000);
		for (Employee i : listObj) {
			System.out.println(i);
		}
	}

}
