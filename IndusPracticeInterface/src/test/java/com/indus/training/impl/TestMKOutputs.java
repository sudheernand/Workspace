/**
 * 
 */
package com.indus.training.impl;

import com.indus.training.domain.MilesToKmsInput;
import com.indus.training.service.MKOutputs;

import junit.framework.TestCase;

public class TestMKOutputs extends TestCase {
	MKOutputs tObj;

	protected void setUp() throws Exception {
		tObj = new MKOutputs();
	}

	protected void throwDown() throws Exception {
		tObj = null;
	}

	public void testConvmk() {
		MilesToKmsInput iObj = new MilesToKmsInput();
		double input = 10;
		double expectedResult = 16.6;
		iObj.setInput1(input);
		tObj.convmk(iObj);
		System.out.println(iObj);
		
		
		double actualResult = iObj.getResult();
		assertEquals(expectedResult, actualResult, 0.2);
		
		
		
		
		
		

	}

}
