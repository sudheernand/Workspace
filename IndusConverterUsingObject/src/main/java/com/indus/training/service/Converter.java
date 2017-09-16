package com.indus.training.service;

import com.indus.training.domain.ConInputs;
import com.indus.training.domain.ConOutputs;
import com.indus.training.domain.IConverter;

public class Converter implements IConverter {

	public ConOutputs conED(ConInputs param) {
		ConOutputs outObj = null;
		{
			outObj = new ConOutputs();
			double result = param.getInput1() * 1.08;
			outObj.setResult(result);

		}
		return outObj;
	}

}
