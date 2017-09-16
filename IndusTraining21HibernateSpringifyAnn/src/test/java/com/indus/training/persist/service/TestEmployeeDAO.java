package com.indus.training.persist.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDAO;
import com.indus.training.persist.util.HibernateUtil;

public class TestEmployeeDAO {

	private static ApplicationContext context;
	private EmployeeDAO empDAOObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		context = new AnnotationConfigApplicationContext(HibernateUtil.class, EmployeeDAO.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		context = null;
	}

	@Before
	public void setUp() throws Exception {

		empDAOObj = context.getBean(EmployeeDAO.class);
	}

	@After
	public void tearDown() throws Exception {
		empDAOObj = null;
	}

	@Test
	public void testSelect() {

		try {
			System.out.println(empDAOObj.select(103));
		} catch (PersistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
