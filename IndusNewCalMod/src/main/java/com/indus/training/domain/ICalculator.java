package com.indus.training.domain;
/***
 * 
 * @author sudheer
 * Description : this interface is used to for operations
 *
 */

public interface ICalculator {
	/***
	 * 
	 * @param param is the argument of type CalciIputs
	 * @return CalcOutputs type object
	 */
	public CalcOutputs add(CalcInputs param);

	public CalcOutputs sub(CalcInputs param);

}
