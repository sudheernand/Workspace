package com.indus.training.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
	
	private ICalci calObj = null;
	private ApplicationContext appObj = null;

	@Before
	public void setUp() throws Exception {
		appObj = new ClassPathXmlApplicationContext("Spring-Config.xml");
		calObj = (ICalci) appObj.getBean("calciObj");
	}

	@After
	public void tearDown() throws Exception {
		calObj = null;
		appObj = null;
	}

	@Test
	public void test() {
		double result = calObj.addition(10, 20);
		System.out.println(result);
	}

}
