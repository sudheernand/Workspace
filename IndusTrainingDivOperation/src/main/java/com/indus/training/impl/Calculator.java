package com.indus.training.impl;

import com.indus.training.domain.CalInput;
import com.indus.training.domain.CalOutput;

import com.indus.training.service.ICalculator;
/***
 * 
 * @author sudheer
 *implements the interface to perform divide operation
 *
 */

public class Calculator implements ICalculator {
	/***
	 * returns out of CalOutput data type has the output variables assigned after divide operation  
	 */

	public CalOutput div(CalInput calInObj)  {
		{
			CalOutput calOutObj = null;
			{
				try {
					int input1 = calInObj.getInput1();
					int input2 = calInObj.getInput2();
					int result = input1 / input2;

					calOutObj = new CalOutput();
					calOutObj.setOperation("division");
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
}