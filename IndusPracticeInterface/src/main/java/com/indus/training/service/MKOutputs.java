package com.indus.training.service;

import com.indus.training.domain.MilesToKmsInput;

public class MKOutputs {
	public  final double convmk(MilesToKmsInput param){
		 double result ;
		
		 result = param.getInput1()*1.66;
		 param.setResult(result);
		 
		 
		 
			return result;

	}
}
