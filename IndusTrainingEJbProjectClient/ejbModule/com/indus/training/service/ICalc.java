package com.indus.training.service;

import javax.ejb.Remote;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;

@Remote
public interface ICalc {
	public CalcOutputs add(CalcInputs calInObj);

}
