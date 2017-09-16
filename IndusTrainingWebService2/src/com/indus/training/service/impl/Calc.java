package com.indus.training.service.impl;

import javax.jws.WebService;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.exception.CalcException;
import com.indus.training.service.ICalc;

@WebService(targetNamespace = "service.training.indus.com", portName = "CalcPort", serviceName = "CalcService", endpointInterface = "com.indus.training.service.ICalc")
public class Calc implements ICalc {

	public CalcOutputs add(CalcInputs calInObj) throws CalcException {
		CalcOutputs calOutObj = null;
		{
			try {
				Double input1 = calInObj.getInput1();
				Double input2 = calInObj.getInput2();
				Double result = input1 + input2;

				calOutObj = new CalcOutputs();
				calOutObj.setOperation("addition");
				calOutObj.setParam1(input1);
				calOutObj.setParam2(input2);
				calOutObj.setResult(result);

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return calOutObj;
		}

	}
}