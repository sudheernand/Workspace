package com.indus.training.service;

import com.indus.training.domain.CalInput;
import com.indus.training.domain.CalOutput;

public interface ICalculator {
	public CalOutput add(CalInput calInputObj) throws Exception;
	public CalOutput sub(CalInput calInputObj) throws Exception;
	public CalOutput mul(CalInput calInputObj) throws Exception;
	public CalOutput div(CalInput calInputObj) throws Exception;
	

}
