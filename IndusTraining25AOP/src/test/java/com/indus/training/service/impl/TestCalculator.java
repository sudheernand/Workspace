package com.indus.training.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.domain.ICalculator;

public class TestCalculator {
	private ICalculator calObj;
	private static ApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[] { "Ioc.xml" });
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		calObj = (ICalculator) context.getBean("calc");
	}

	@After
	public void tearDown() throws Exception {
		calObj = null;
	}

	@Test
	public void testAdd() {
		CalcInputs calInObj = new CalcInputs();
		calInObj.setInput1(10);
		calInObj.setInput2(30);

		CalcOutputs expCalOutObj = new CalcOutputs();
		expCalOutObj.getOperation();
		expCalOutObj.setParam1(10.00);
		expCalOutObj.setParam2(30.00);
		expCalOutObj.setResult(40.00);

		CalcOutputs actCalOutObj = calObj.add(calInObj);
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);
		// assertEquals(expCalOutObj.getOperation(),
	}

}
