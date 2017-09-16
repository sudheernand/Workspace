package com.indus.training.service;

import com.indus.training.java.Calculator;
import com.indus.training.java.ScientificCalculator;

import junit.framework.TestCase;

public class TestCalc extends TestCase {
	private Calculator calObj;
	private ScientificCalculator sObj;

	protected void setUp() throws Exception {
		calObj = new Calculator();
	
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdd() {
		double input1 =10.00;
		double input2 = 20.00;
		double expectedResult = 30.00;
		double actualResult = calObj.add(input1,input2);
		assertEquals(expectedResult, actualResult, 0);
		
	}

	public void testMultiply() {
		double input1 =10.00;
		double input2 = 20.00;
		double expectedResult = 30.00;
		double actualResult = calObj.add(input1,input2);
		assertEquals(expectedResult, actualResult, 0);
	}

	public void testSubstract() {
		double input1 =10.00;
		double input2 = 20.00;
		double expectedResult = 30.00;
		double actualResult = calObj.substract(input1,input2);
		assertEquals(expectedResult, actualResult, 0);
		
	}

	public void testDivide() {
		double input1 =10.00;
		double input2 = 20.00;
		double expectedResult = 30.00;
		double actualResult = calObj.divide(input1,input2);
		assertEquals(expectedResult, actualResult, 0);
	}

}
