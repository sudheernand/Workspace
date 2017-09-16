package com.indus.training.test;

import static org.junit.Assert.*;

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

	@Test
	public void testReadUsingHQl() throws PersistException {
		Employee empObj = new Employee();
		empObj = empDAOObj.readUsingHQl("Lex");
		System.out.println(empObj);
	}

	@Test
	public void testReadUsingCriteria() throws PersistException {
		Employee empObj = new Employee();
		empObj = empDAOObj.readUsingCriteria("Lex");
		System.out.println(empObj);
	}

	@Test
	public void testReadUsingNativeSQL() throws PersistException {
		Employee empObj = new Employee();
		empObj = empDAOObj.readUsingNativeSQL("Lex");
		System.out.println(empObj);
	}

	@Test
	public void testReadUsingNamedQuery() throws PersistException {
		Employee empObj = new Employee();
		empObj = empDAOObj.readUsingNamedQuery("Lex");
		System.out.println(empObj);
	}

}
