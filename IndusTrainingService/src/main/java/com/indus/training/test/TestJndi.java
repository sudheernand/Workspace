package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.entity.Contact;
import com.indus.training.implementation.JndiService;

public class TestJndi {
	private JndiService jnObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		jnObj = new JndiService();
	}

	@After
	public void tearDown() throws Exception {
		jnObj = null;
	}

	@Test
	public void testBind() {
		Contact conObj = new Contact();
		conObj.setFirstname("sudheer");
		conObj.setLastname("renukunta");

		try {
			jnObj.bind(conObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUnbind() {

		try {
			jnObj.unbind("one");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testlookup() {

		try {
			System.out.println(jnObj.lookup("one"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testrebind() {

		try {
			jnObj.rebind("one", "new");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
