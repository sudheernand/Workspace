package com.indus.training.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.dao.impl.DepartmentDAO;
import com.indus.training.persist.entity.Department;

public class TestDepartmentDAO {

	private DepartmentDAO daoObj;
	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[] { "ioc.xml" });
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context = null;
	}

	@Before
	public void setUp() throws Exception {
		daoObj = (DepartmentDAO) context.getBean("daoBean");
	}

	@After
	public void tearDown() throws Exception {
		daoObj = null;
	}

	// @Test
	// public void testSelect() {
	//
	// Integer departmentId = 10;
	// String departmentName = "";
	// Integer managerId = 100;
	// Integer locationId = 1700;
	//
	// Department deptExpObj = new Department();
	// deptExpObj.setDepartmentId(departmentId);
	// deptExpObj.setDepartmentName(departmentName);
	// deptExpObj.setManagerId(managerId);
	// deptExpObj.setLocationId(locationId);
	//
	// Department deptActObj = null;
	//
	// deptActObj = daoObj.select(departmentId);
	// System.out.println(deptActObj);
	// assertEquals(deptExpObj, deptActObj);
	// }

	@Test
	public void testFindAll() {

		Department depObj = daoObj.findOne(20);

		System.out.println(depObj);

	}

}
