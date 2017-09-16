package com.indus.training.java;

import com.indus.training.java.impl.FarenToCelsius;

public class TestFarenToCelsius {

	public static void main(String[] args) {
		FarenToCelsius ftcObj = new FarenToCelsius();
		double input = 100.00;
		double resultVal = ftcObj.conversionFC(input);
		System.out.println("temparature in celsius is :" +resultVal);
		
		
		

	}

}
