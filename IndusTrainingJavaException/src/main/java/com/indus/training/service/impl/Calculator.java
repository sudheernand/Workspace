package com.indus.training.service.impl;

import com.indus.training.domain.CalInput;
import com.indus.training.domain.CalOutput;
import com.indus.training.exception.CalculatorException;
import com.indus.training.service.ICalculator;

public class Calculator implements ICalculator {
	public CalOutput add(CalInput calInputObj) throws CalculatorException {
		CalOutput calOutObj = null;
		if (calInputObj == null) {
			throw new CalculatorException("Input Object is null");

		}
		Double param1 = calInputObj.getInput1();
		Double param2 = calInputObj.getInput2();
		if (param1 == null || param2 == null) {
			throw new CalculatorException("param1 or param2 is null");

		}
		try {
			Double result = param1 + param2;
			calOutObj = new CalOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setOperation("Addition");
			calOutObj.setResult(result);
		} catch (Exception ex) {
			throw new CalculatorException("some other exception, ex");
		}
		return calOutObj;

	}

	public CalOutput sub(CalInput calInputObj) throws Exception {

		CalOutput calOutObj = null;
		if (calInputObj == null) {
			throw new CalculatorException("Input Object is null");

		}
		Double param1 = calInputObj.getInput1();
		Double param2 = calInputObj.getInput2();
		if (param1 == null || param2 == null) {
			throw new CalculatorException("param1 or param2 is null");

		}
		try {
			Double result = param1 - param2;
			calOutObj = new CalOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setOperation("Substract");
			calOutObj.setResult(result);
		} catch (Exception ex) {
			throw new CalculatorException("some other exception, ex");
		}
		return calOutObj;

	}

	public CalOutput mul(CalInput calInputObj) throws Exception {

		CalOutput calOutObj = null;
		if (calInputObj == null) {
			throw new CalculatorException("Input Object is null");

		}
		Double param1 = calInputObj.getInput1();
		Double param2 = calInputObj.getInput2();
		if (param1 == null || param2 == null) {
			throw new CalculatorException("param1 or param2 is null");

		}
		try {
			Double result = param1 * param2;
			calOutObj = new CalOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setOperation("Multiplt");
			calOutObj.setResult(result);
		} catch (Exception ex) {
			throw new CalculatorException("some other exception, ex");
		}
		return calOutObj;
	}

	public CalOutput div(CalInput calInputObj) throws Exception {

		CalOutput calOutObj = null;
		if (calInputObj == null) {
			throw new CalculatorException("Input Object is null");

		}
		Double param1 = calInputObj.getInput1();
		Double param2 = calInputObj.getInput2();
		if (param1 == null || param2 == null) {
			throw new CalculatorException("param1 or param2 is null");

		}
		try {
			Double result = param1 / param2;
			calOutObj = new CalOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setOperation("Divide");
			calOutObj.setResult(result);
		} catch (Exception ex) {
			throw new CalculatorException("some other exception, ex");
		}
		return calOutObj;
	}

}
