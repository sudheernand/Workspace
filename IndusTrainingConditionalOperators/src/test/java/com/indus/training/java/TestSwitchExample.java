package com.indus.training.java;

import junit.framework.TestCase;


public class TestSwitchExample extends TestCase {
	SwitchExample nObj;

	protected void setUp() throws Exception {
		nObj = new SwitchExample();
		
	}

	protected void tearDown() throws Exception {
		nObj = null;
	}

	public void testAssign() {
		String input = "wednesday";
		int  expectedResult = 3;
		int actualResult = nObj.assign(input);
		assertEquals(expectedResult, actualResult, 0.0);
		
		
		
		
		
	}

}
