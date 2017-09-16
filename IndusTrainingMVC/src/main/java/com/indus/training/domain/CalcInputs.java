package com.indus.training.domain;

/***
 * 
 * @author sudheer Description : has all the input variables and methods to set
 *         and get data those of type private
 *
 */

public class CalcInputs {
	/***
	 * has input variables
	 */

	private Double param1;
	private Double param2;

	public CalcInputs() {
		super();
	}

	public Double getParam1() {
		return param1;
	}

	public void setParam1(Double param1) {
		this.param1 = param1;
	}

	public Double getParam2() {
		return param2;
	}

	public void setParam2(Double param2) {
		this.param2 = param2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((param1 == null) ? 0 : param1.hashCode());
		result = prime * result + ((param2 == null) ? 0 : param2.hashCode());
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
		if (param1 == null) {
			if (other.param1 != null)
				return false;
		} else if (!param1.equals(other.param1))
			return false;
		if (param2 == null) {
			if (other.param2 != null)
				return false;
		} else if (!param2.equals(other.param2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CalcInputs [param1=" + param1 + ", param2=" + param2 + "]";
	}

}
