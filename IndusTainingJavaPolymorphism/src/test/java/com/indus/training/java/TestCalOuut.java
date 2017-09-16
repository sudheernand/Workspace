package com.indus.training.java;

import com.indus.training.java.service.Calout;

import junit.framework.TestCase;

public class TestCalOuut extends TestCase {
	private Calout calObj;

	protected void setUp() throws Exception {
		calObj =new Calout();	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdditionDoubleArray() {
	double[] input = {1,2.2,3.8,5};
	double expectedResult = 12;
	double actualResult = calObj.addition( input );
	System.out.println(""+actualResult);
	assertEquals(expectedResult, actualResult, 0);
	
	
		
	}

}
