package com.indus.training.test;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.service.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	private Calculator calObj;

	protected void setUp() throws Exception {
		calObj = Calculator.getInstance();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdd() {
		CalcInputs calInObj = new CalcInputs();
		calInObj.setInput1(10);
		calInObj.setInput2(10);
		CalcOutputs exCalOutObj = new CalcOutputs();
		exCalOutObj.setParam1(10.0);
		exCalOutObj.setParam2(10.00);
		exCalOutObj.setResult(20.0);

		CalcOutputs actCalOutObj = new CalcOutputs();
		actCalOutObj = calObj.add(calInObj);

		assertEquals(actCalOutObj.getResult(), exCalOutObj.getResult(), 0);

	}

}
