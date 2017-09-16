package com.indus.training.java;

public class Calculator implements ICalculator  {
	public double add(double param1, double param2) {
		double input1 = param1;
		double input2 = param2;
		double val = input1 + input2;
		return val;

	}

	public double multiply(double param1, double param2) {
		double input1 = param1;
		double input2 = param2;
		double val = input1 * input2;
		return val;

	}


	public double substract(double param1, double param2) {
		double input1 = param1;
		double input2 = param2;
		double val = input1 - input2;
		return val;

	}


	public double divide(double param1, double param2) {
		double input1 = param1;
		double input2 = param2;
		double val = input1 / input2;
		return val;

	}

	
	}



