/**
 * 
 */
package com.indus.training.java;

/**
 * @author sudheer Description : for getting Fibonacci using if else and for
 *         loop
 *
 */
public class Fibonacci {
	/**
	 * 
	 * @param count:
	 *            for number of numbers to print in the sequence
	 */

	public double[] fibNumbers(double startnum1, double startnum2, int count) {
		/**
		 * prints fibonacci numbers
		 */
		double[] fibarray = new double[count];
		fibarray[0] = startnum1;
		fibarray[1] = startnum2;

		for (int i = 2; i < count; i++) {
			fibarray[i] = fibarray[i - 1] + fibarray[i - 2];

		}
		return fibarray;

	}

}
