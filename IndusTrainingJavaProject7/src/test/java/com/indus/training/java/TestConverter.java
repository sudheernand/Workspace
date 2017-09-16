package com.indus.training.java;

import com.indus.training.java.impl.TemparatureConversions;

import junit.framework.TestCase;

public class TestConverter extends TestCase {
		private TemparatureConversions tcObj;

	protected void setUp() throws Exception {
		System.out.println("TemparatureConversions; setup; ");
		tcObj = new TemparatureConversions();
	}

	protected void tearDown() throws Exception {
		System.out.println("TemparatureConversions; teardown; ");
		tcObj = null;
	}

	public void testConversionFCCase1() {
		System.out.println("fc method run");
		// step1 : input 
		double input = 10.0;
		// step2 : expectedResult 
		double expectedResult = -12.22;
		// step3 : actual result
		double actualResult = tcObj.conversionFC(input);
		// step4 : assert expected vs actual result 
		assertEquals(expectedResult, actualResult, 0.01);
	}
	

	public void testConversionCFCase1() {
		// step1 : input 
		double input = 0.0;
		System.out.println();
		// step2 : expectedResult 
		double expectedResult = 32.0;
		// step3 : actual result
		double actualResult = tcObj.conversionCF(input);
		// step4 : assert expected vs actual result 
		assertEquals(expectedResult, actualResult, 0);
		}
	
	public void testConversionFCCase2() {
		System.out.println("fc method run");
		// step1 : input 
		double input = 100.0;
		// step2 : expectedResult 
		double expectedResult = 37.77;
		// step3 : actual result
		double actualResult = tcObj.conversionFC(input);
		// step4 : assert expected vs actual result 
		assertEquals(expectedResult, actualResult, 0.1);
	}
	

	public void testConversionCFCase2() {
		// step1 : input 
		double input = 200.0;
		System.out.println();
		// step2 : expectedResult 
		double expectedResult = 392.00;
		// step3 : actual result
		double actualResult = tcObj.conversionCF(input);
		// step4 : assert expected vs actual result 
		assertEquals(expectedResult, actualResult, 0);
		}

}
