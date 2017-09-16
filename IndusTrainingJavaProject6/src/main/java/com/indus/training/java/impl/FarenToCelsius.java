package com.indus.training.java.impl;

public class FarenToCelsius {
	public double  conversionFC(double param)
	
	{
		double result = 0.0;
		
		double a = 1.8;
		double b = 32;
		 
		
		result = (param - b )/a;
		
		
		return result ;
	}
}
