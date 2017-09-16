package com.indus.training.impl;

import com.indus.training.service.ICalculator;

public class ScientificCalculator {
	public double add(double param4, double param5) {

		double input1 = param4;
		double input2 = param5;

		ICalculator calObj = new ICalculator() {

			public double addition(double param1, double param2) {

				double result = param1 + param2;
				return result;
			}
		};

		double result = calObj.addition(input1, input2);

		return result;
	}

}
