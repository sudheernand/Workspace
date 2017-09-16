package com.indus.training.service.impl;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.service.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	private Calculator calObj;

	protected void setUp() throws Exception {

		calObj = new Calculator();

	}

	protected void tearDown() throws Exception {

		calObj = null;

	}

	public void testAdd() {
		CalcInputs calInObj = new CalcInputs();
		calInObj.setInput1(10);
		calInObj.setInput2(30);

		CalcOutputs expCalOutObj = new CalcOutputs();
		expCalOutObj.getOperation();
		expCalOutObj.setParam1(10.00);
		expCalOutObj.setParam2(30.00);
		expCalOutObj.setResult(40.00);

		CalcOutputs actCalOutObj = calObj.add(calInObj);
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);
		// assertEquals(expCalOutObj.getOperation(),
		// actCalOutObj.getOperation(), 0);

	}

}
