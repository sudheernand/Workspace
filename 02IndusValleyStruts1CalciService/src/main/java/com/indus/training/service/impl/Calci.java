package com.indus.training.service.impl;

import com.indus.training.service.ICalci;

public class Calci implements ICalci {

	public double addition(double param1, double param2) {
		double result = 0;
		result = param1 + param2;
		return result;
	}

	public double subtract(double param1, double param2) {
		double result = 0;
		result = param1 - param2;
		return result;
	}

	public double multiply(double param1, double param2) {
		double result = 0;
		result = param1 * param2;
		return result;
	}

	public double division(double param1, double param2) {
		double result = 0;
		result = param1 / param2;
		return result;
	}

}
