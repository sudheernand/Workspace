package com.indus.training.service;

import com.indus.training.io.CalculatorIO;

public class TestCalculatorIO {

	public static void main(String[] args) {
		CalculatorIO calObj = new CalculatorIO();
		calObj.readFromSrcWriteToDest("input.txt","output.txt" );

	}

}
