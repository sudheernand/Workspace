package com.indus.training.service.impl;

import com.indus.training.domain.CalInput;

import com.indus.training.domain.CalOutput;
import com.indus.training.domain.TempInput;
import com.indus.training.domain.TempOutput;

import com.indus.training.exception.TemparatureException;
import com.indus.training.service.ITemparature;

public class Temparature implements ITemparature {
	Calculator calObj = new Calculator();

	public TempOutput fahrenToCels(TempInput temInObj) throws TemparatureException {

		TempOutput temOutObj = null;

		if (temInObj == null) {
			throw new TemparatureException("temp input obj is null");
		}
		Double input1 = temInObj.getInput1();
		if (input1 == null) {
			throw new TemparatureException("input1 in input obj is null");
		}
		try {

			CalInput calInObj = new CalInput();

			calInObj.setInput1(input1);
			Double input2 = 32.0;
			calInObj.setInput2(input2);

			CalOutput calOutObj = calObj.sub(calInObj);

			Double inputs1 = calOutObj.getResult();

			calInObj.setInput1(inputs1);
			Double inputs2 = 0.55555555555;
			calInObj.setInput2(inputs2);
			calOutObj = calObj.mul(calInObj);

			Double result = calOutObj.getResult();
			temOutObj = new TempOutput();
			temOutObj.setResult(result);
			temOutObj.setConversionUsed("FahrenHeit to celsius scale");
		} catch (Exception ex) {
			throw new TemparatureException("some other exception, ex");
		}

		return temOutObj;
	}
}
