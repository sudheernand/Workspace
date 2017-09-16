package com.indus.training.domain;

import com.indus.training.impl.CircleOut;

import junit.framework.TestCase;

public class JtestCircel extends TestCase {
	private CircleOut tcObj;

	protected void setUp() throws Exception {
		 tcObj = new CircleOut();
	}

	protected void tearDown() throws Exception {
		tcObj = null;
		
	}

	public void testPerimeter() {
		System.out.println("permiter  method run");
		// step1 : input 
		double input = 10.0;
		// step2 : expectedResult 
		double expectedResult = 62.8;
		// step3 : actual result
		double actualResult = tcObj.perimeter(input);
		
		assertEquals(expectedResult, actualResult, 0.01);
		
	}

	public void testArea() {
		System.out.println("area method run");
		// step1 : input 
		double input = 10.0;
		// step2 : expectedResult 
		double expectedResult = 314;
		// step3 : actual result
		double actualResult = tcObj.area(input);
		
		assertEquals(expectedResult, actualResult, 0.0);
		
	}
	

}
