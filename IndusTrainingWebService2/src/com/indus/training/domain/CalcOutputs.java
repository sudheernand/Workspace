package com.indus.training.domain;

import java.io.Serializable;

/***
 * 
 * @author sudheer stores output variables by using setters and getters methods
 *         .
 *
 */
public class CalcOutputs implements Serializable {

	private Double result = 0.0;
	private Double param1 = 0.0;
	private Double param2 = 0.0;

	private String operation;

	public CalcOutputs() {
		super();
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
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

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "CalcOutputs [result=" + result + ", param1=" + param1 + ", param2=" + param2 + ", operation="
				+ operation + "]";
	}

}
