package com.indus.training.persist.service;

import static org.junit.Assert.*;

import org.hibernate.Hibernate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.IEmployeeDAO;
import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDAO;
import com.indus.training.persist.util.HibernateUtil;

public class TestEmployeeDAO {

	private static ApplicationContext context;
	private IEmployeeDAO empDAOObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		context = new ClassPathXmlApplicationContext(new String[] { "HibernateSpringifyIoc.xml" });
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		context = null;
	}

	@Before
	public void setUp() throws Exception {

		empDAOObj = (IEmployeeDAO) context.getBean("employeeDAO");
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
