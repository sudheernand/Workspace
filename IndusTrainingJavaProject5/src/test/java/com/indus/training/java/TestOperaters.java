package com.indus.training.java;

import com.indus.training.java.impl.Calculator;

import junit.framework.TestCase;

public class TestOperaters extends TestCase {
	
	private Calculator calObj;
	

	protected void setUp() throws Exception {
		System.out.println("Calculator ; setup; ");
		calObj = new Calculator();
	}

	protected void tearDown() throws Exception {
		System.out.println("Calculator; teardown; ");
		calObj = null;
	}

	public void testDivisioncase1() {
		System.out.println(" method run");
	    // step1 : input 
	    double input1 = 10.0;
	    // step2 : expectedResult 
	    double input2 = 5.0;
	    // step3 : expectedResult
	    double expectedResult = 2.00;
	    // step4 : actual result
	    double actualResult = calObj.division(input1,input2);
	   // step5 : assert expected vs actual result 
	 	assertEquals(expectedResult, actualResult, 0);
	 
	    
	}

}
