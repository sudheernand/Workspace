package com.indus.training.domain;

/***
 * 
 * @author sudheer has inputs and methods for changing and getting the variables
 *
 */

public class CalInput {

	private int input1;
	private int input2;

	/***
	 * 
	 * @param input1
	 *            variable of type int to store user input1
	 * @param input2
	 *            variable of type int to store user input2
	 */
	public CalInput(int input1, int input2) {

		super();
		this.input1 = input1;
		this.input2 = input2;
	}

	/***
	 * default constructor
	 */
	public CalInput() {
		super();
	}

	public int getInput1() {
		return input1;
	}

	public void setInput1(int input1) {
		this.input1 = input1;
	}

	public int getInput2() {
		return input2;
	}

	public void setInput2(int input2) {
		this.input2 = input2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + input1;
		result = prime * result + input2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CalInput))
			return false;
		CalInput other = (CalInput) obj;
		if (input1 != other.input1)
			return false;
		if (input2 != other.input2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CalInput [input1=" + input1 + ", input2=" + input2 + "]";
	}

}
