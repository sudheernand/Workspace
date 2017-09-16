package com.indus.training.impl;

import com.indus.training.domain.Conversions;
import com.indus.training.domain.IConversions;

import junit.framework.TestCase;

public class TestConversions extends TestCase {
	private IConversions iObj;

	protected void setUp() throws Exception {
		iObj= new Conversions();
	}

	protected void tearDown() throws Exception {
		iObj = null;
	}

	public void testConvCF() {
		double input =0;
		double expectedResult = 32;
		double actualResult = iObj.convCF(input);		
		assertEquals(expectedResult, actualResult, 0);
	}

}
