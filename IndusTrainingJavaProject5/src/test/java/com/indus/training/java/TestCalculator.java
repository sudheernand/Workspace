package com.indus.training.java;

import com.indus.training.java.impl.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calObj = new Calculator();

		double input1 = 20;
		double input2 = 40;
		double resultVal = calObj.division(input1, input2);
		System.out.println("parem1 ;" + input1);
		System.out.println("parem2 ;" + input2);
		System.out.println("result ;" + resultVal);
		

	}

}
