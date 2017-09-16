package com.indus.training.java;

import com.indus.training.java.service.Calout;

import junit.framework.TestCase;

public class TestCalOut extends TestCase {
	private Calout calObj;

	protected void setUp() throws Exception {
	calObj = new Calout();
	}

	protected void tearDown() throws Exception {
		calObj = null;
		
	}

	public void testaddition() {
		System.out.println(" method run");
	  
	    double input1 = 10.0;
	  
	    double input2 = 5.0;
	  
	    double expectedResult = 15.0;
	 
	    double actualResult = calObj.addition(input1, input2);
	    
	 	assertEquals(expectedResult, actualResult, 0);
	 
		
	}
	public void testadditionn()
	{
		double input1 = 10;
		double input2 = 20;
		double expectedResult = 30;
		
		 double[] input3 = {10,20};
		double actualResult = calObj.addition(10,20);
		
		assertEquals(expectedResult, actualResult, 0);
		
		
		
	}

}
