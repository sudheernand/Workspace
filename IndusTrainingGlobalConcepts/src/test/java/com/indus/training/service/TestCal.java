package com.indus.training.service;

import com.indus.training.domain.Calculator;

import junit.framework.TestCase;

public class TestCal extends TestCase {

	protected void setUp() throws Exception {

	}

	protected void tearDown() throws Exception {

	}

	public void testAdd() {
		double input1 =1;
		double input2 =2;
		double expected = input1+input2;
		double actual = Calculator.add(input1, input2);
		assertEquals(expected, actual, 0);
		
	
	}

}
