package com.indus.training.java;

import com.indus.training.java.impl.TemparatureConversions;

public class TestTemparatureConversions {

	public static void main(String[] args) {
		TemparatureConversions temObj = new TemparatureConversions();
		double input1 = 45;
		double resultVal = temObj.conversionCF(input1);
		System.out.println(input1+"celsius temparature in farenheit is "+resultVal);
		

	}

}
