package com.indus.training.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.exception.CalcException;

@WebService(name = "calcWs", targetNamespace = "service.training.indus.com")
public interface ICalc {
	@WebMethod(operationName = "Add")
	public  @WebResult (name = "calcResult",partName = "calcOutObject") CalcOutputs add(@WebParam CalcInputs calInObj) throws CalcException;

}
