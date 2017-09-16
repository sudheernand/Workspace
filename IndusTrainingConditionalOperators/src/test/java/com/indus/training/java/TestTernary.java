package com.indus.training.java;

import junit.framework.TestCase;

public class TestTernary extends TestCase {
	TernaryExample  tObj;

	protected void setUp() throws Exception {
		tObj = new TernaryExample();
	}

	protected void tearDown() throws Exception {
		tObj = null;
	}

	public void testAge() {
		double input = 34;
		boolean expectedResult = true ;
		boolean actualResult = tObj.age(34);
		assertEquals(expectedResult, actualResult);
		
	}

}
