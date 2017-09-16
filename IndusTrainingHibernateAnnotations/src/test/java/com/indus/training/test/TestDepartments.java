package com.indus.training.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import javax.persistence.PersistenceException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.persist.entity.Department;
import com.indus.training.persist.entity.IDinDepartment;
import com.indus.training.persist.impl.DepartmentDAO;

public class TestDepartments {
	private DepartmentDAO depDAOObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		depDAOObj = new DepartmentDAO();
	}

	@After
	public void tearDown() throws Exception {
		depDAOObj = null;
	}

	@Test
	public void testSelect() {
		Department actualDepObj = null;
		try {
			actualDepObj = depDAOObj.select(10);
			System.out.println(actualDepObj);
			Department expdepObj = new Department();
			IDinDepartment idDepObj = new IDinDepartment();
			idDepObj.setDepartmentId(10);
			expdepObj.setDepartmentName("Administration");
			idDepObj.setLocationId(1700);
			expdepObj.setManagerId(200);
			expdepObj.setDepartmentIDs(idDepObj);

			assertEquals(expdepObj.getDepartmentName(), actualDepObj.getDepartmentName());
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

	}
	//
	// @Test
	// public void testCreate() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testUpdate() {
	// fail("Not yet implemented");
	// }

}
