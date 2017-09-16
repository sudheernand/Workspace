package com.indus.training.java;

import com.indus.training.java.impl.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator calObj = new Calculator();
		double input1 = 10.0;
		double input2 = 20.0;
		double resultVal = calObj.addition(input1, input2);

		System.out.println("param1 ;" + input1);
		System.out.println("param2 ;" + input2);
		System.out.println("result ;" + resultVal);
	}

}
