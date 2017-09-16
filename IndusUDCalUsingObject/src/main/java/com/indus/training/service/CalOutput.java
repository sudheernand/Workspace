package com.indus.training.service;

import com.indus.training.domain.Calculator;

public class CalOutput {


public double add(Calculator param){
	double addval = param.getInput1()+ param.getInput2();
	param.setResult(addval);
	return addval;
	 
	
}

public double sub(Calculator param){
	double subval = param.getInput1()- param.getInput2();
	return subval;

}

public double div(Calculator param){
	double divval = param.getInput1()/ param.getInput2();
	return divval;
}
public double mul(Calculator param){
	double divval = param.getInput1()/ param.getInput2();
	return divval;
}
}