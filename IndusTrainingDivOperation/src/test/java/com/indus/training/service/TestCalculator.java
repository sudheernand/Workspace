package com.indus.training.service;

import com.indus.training.domain.CalInput;
import com.indus.training.domain.CalOutput;

import com.indus.training.impl.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	Calculator calObj;

	protected void setUp() throws Exception {
		calObj = new Calculator();
	}

	protected void Teardown() throws Exception {
		calObj = null;
	}

	public void testDiv() {

		CalInput calInObj = new CalInput();
		calInObj.setInput1(10);
		calInObj.setInput2(5);

		CalOutput expCalOutObj = new CalOutput();
		expCalOutObj.getOperation();
		expCalOutObj.setParam1(10);
		expCalOutObj.setParam2(5);
		expCalOutObj.setResult(2);

		CalOutput actCalOutObj = calObj.div(calInObj);
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

	}

}
