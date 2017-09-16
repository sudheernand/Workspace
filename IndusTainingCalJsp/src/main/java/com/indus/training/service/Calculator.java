package com.indus.training.service;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.domain.ICalculator;

/***
 * 
 * @author sudheer : it has the behaviour by acessing variables in Calcinputs
 *         and CalciOutputs objects .
 */

public class Calculator implements ICalculator {
	/***
	 * does addition operation performs the operations by accesing and assigning
	 * the variables in CalciInputs and CalciOutputs instances
	 */
	public CalcOutputs add(CalcInputs calInObj) {
		CalcOutputs calOutObj = null;
		{
			try {
				Double input1 = calInObj.getParam1();
				Double input2 = calInObj.getParam2();
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

	public CalcOutputs sub(CalcInputs param) {

		return null;
	}

}
