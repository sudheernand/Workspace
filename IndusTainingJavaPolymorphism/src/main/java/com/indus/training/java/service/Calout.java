package com.indus.training.java.service;

public class Calout {

	public double addition(double param1, double param2) {

		double resultval = param1 + param2;
		return resultval;

	}

	public double addition(double param1, double param2, double param3) {
		double resultval = param1 + param2 + param3;
		return resultval;
	}

	public double addition(double param1, int param2) {
		double resultval = param1 + param2;
		return resultval;
	}

	//public double addition(double[] params) {
		//double result = 0.0;

		//for (int i = 0; i < params.length; i++) {
			//result = result + params[i];

		//}
		//return result;

	//}
	public double addition(double...  param)
	{
		double result = 0.0;

		for (int i = 0; i < param.length; i++) {
			result = result + param[i];
			
			
	}
		return result;
		
		
	}
}
