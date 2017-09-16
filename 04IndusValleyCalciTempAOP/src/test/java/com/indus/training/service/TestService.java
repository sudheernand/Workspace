package com.indus.training.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.domain.TempIn;
import com.indus.training.domain.TempOut;

public class TestService {
	
	private ITemp tempObj = null;
	private ApplicationContext appObj = null;

	@Before
	public void setUp() throws Exception {
		appObj = new ClassPathXmlApplicationContext("spring-config.xml");
		tempObj = (ITemp) appObj.getBean("tempObj");
	}

	@After
	public void tearDown() throws Exception {
		tempObj = null;
		appObj = null;
	}

	@Test
	public void test() {
		
		TempIn tempInObj = new TempIn();
		tempInObj.setTemp(32);
		TempOut outObj = tempObj.cToF(tempInObj);
		System.out.println(outObj.getResult());
		
	}

}
