package com.indus.training.service;

import com.indus.training.domain.CalInput;
import com.indus.training.domain.CalOutput;
/***
 * 
 * @author sudheer
 * interface for calculator class has method definations of the calculator class
 */

public interface ICalculator {
	/***
	 * 
	 * @param param is the argument of type CalciIputs
	 * @return CalcOutputs type object
	 */
	public CalOutput div(CalInput param)throws Exception;


}
