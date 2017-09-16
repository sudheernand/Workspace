package com.indus.training.java;

/**
 *
 * @author sudheer description : for assigning a number value to the day
 *
 */

public class SwitchExample {
	/**
	 * 
	 * @param day
	 *            : name of the day assign methods gets string day and
	 *            initializes switch cases
	 */
	public int assign(String day) {
		/**
		 * assigns the the value to the string passing through each case
		 */
		int result = 0;
		switch (day) {
		case "monday":
			result = 1;
			break;
		case "tuesday":
			result = 2;
			break;
		case "wednesday":
			result = 3;
			break;
		case "thursday":
			result = 4;
			break;
		case "fryday":
			result = 5;
			break;
		case "saturday":
			result = 6;
			break;
		case "sunday":
			result = 7;
			break;
			
		}
		return result;
	}
}


