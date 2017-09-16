package com.indus.training.java.impl;

/**
 * 
 * @author sudheer
 *
 *         description ; for temparature conversion
 * 
 */
public class TemparatureConversions {

	/**
	 * 
	 * description ; to convert from farenheit to celsius
	 * 
	 * @param param;
	 * @return;
	 */

	public double conversionFC(double param)

	{
		double div = 1.8;
		int sub = 32;
		double celsius = 0.0;

		celsius = (param - sub) / div;

		return celsius;

	}

	/**
	 * 
	 * for celsius to farenheit
	 * 
	 * @param param
	 *            ; @return;
	 */
	public double conversionCF(double param) {
		double mul = 1.8;
		int add = 32;
		double farenheit = 0.0;

		farenheit = (param * mul) + add;

		return farenheit;

	}
}