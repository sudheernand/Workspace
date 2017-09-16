package com.indus.training.service;

import com.indus.training.domain.CalInput;
import com.indus.training.domain.CalOutput;
import com.indus.training.exception.CalculatorException;
import com.indus.training.service.impl.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	private Calculator calObj ;

	protected void setUp() throws Exception {
		calObj = new Calculator();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdd() throws Exception {
		CalInput calInpObj = new CalInput();
		calInpObj.setInput1(10.0);
		calInpObj.setInput2(20.0);
		// step 2
		CalOutput expCalOutObj = new CalOutput();
		expCalOutObj.setParam1(10.0);
		expCalOutObj.setParam2(20.0);
		expCalOutObj.setOperation("addition");
		expCalOutObj.setResult(30.0);
		//step 3
		CalOutput actCalObj = null;
		try {
			actCalObj = calObj.add(calInpObj);
			
		}catch(CalculatorException calEx){
			calEx.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		// step 4 : assertion 
		assertEquals(expCalOutObj.getResult(), actCalObj.getResult(), 0);
	}

} 
