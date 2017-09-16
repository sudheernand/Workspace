package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;
import com.indus.training.ui.EmployeeUI;

public class TestEmplTM {

	// private IEmployeeDAO emplTmObj;
	// private ApplicationContext contextObj;

	@Before
	public void setUp() throws Exception {
		// contextObj = new ClassPathXmlApplicationContext(new
		// String("applicationContext.xml"));

		// emplTmObj = (IEmployeeDAO) contextObj.getBean("myDaoBean");

	}

	@After
	public void tearDown() throws Exception {

		// emplTmObj = null;
		// contextObj = null;
	}

	@Test
	public void testSelect() throws PersistException {
		//
		// Employee emp = emplTmObj.select(127);
		EmployeeUI UiObj = new EmployeeUI();
		UiObj.crudOptionss();

		// System.out.println(emp.getFirstName());
	}

}
