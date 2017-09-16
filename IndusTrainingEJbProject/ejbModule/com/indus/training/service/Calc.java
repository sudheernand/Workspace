package com.indus.training.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;

/**
 * Session Bean implementation class Calc
 */
@Stateless(mappedName = "jndiCalcObj")

public class Calc implements ICalc {

	/**
	 * Default constructor.
	 */
	public Calc() {
	}

	public CalcOutputs add(CalcInputs calInObj) {
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