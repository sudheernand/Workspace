package com.indus.training.domain;

import java.io.Serializable;

/***
 * 
 * @author sudheer Description : has all the input variables and methods to set
 *         and get data those of type private
 *
 */

public class CalcInputs implements Serializable {
	/***
	 * has input variables
	 */

	private Double input1;
	private Double input2;

	public CalcInputs() {
		super();
	}

	public CalcInputs(Double input1, Double input2) {
		super();
		this.input1 = input1;
		this.input2 = input2;
	}

	@Override
	public String toString() {
		return "CalcInputs [input1=" + input1 + ", input2=" + input2 + "]";
	}

	/***
	 * 
	 * @return gets the input stored when called
	 */
	public double getInput1() {
		return input1;
	}

	public void setInput1(double i) {
		this.input1 = i;
	}

	public double getInput2() {
		return input2;
	}

	public void setInput2(double i) {
		this.input2 = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((input1 == null) ? 0 : input1.hashCode());
		result = prime * result + ((input2 == null) ? 0 : input2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CalcInputs))
			return false;
		CalcInputs other = (CalcInputs) obj;
		if (input1 == null) {
			if (other.input1 != null)
				return false;
		} else if (!input1.equals(other.input1))
			return false;
		if (input2 == null) {
			if (other.input2 != null)
				return false;
		} else if (!input2.equals(other.input2))
			return false;
		return true;
	}

}
