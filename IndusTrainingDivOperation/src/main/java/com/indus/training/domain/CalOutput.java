package com.indus.training.domain;
/***
 * 
 * @author sudheer
 * has out put variable of type int 
 * sets and returns output variable 
 */

public class CalOutput {
	private int result = 0;
	private int param1 = 0;
	private int param2 = 0;

	private String operation;
	/***
	 * default constructor
	 * 
	 */
	
	public CalOutput() {
		
		super();
	}
	/***
	 * 
	 * @param result
	 * @param param1
	 * @param param2
	 * @param operation
	 * 
	 */
	public CalOutput(int result, int param1, int param2, String operation) {
		super();
		this.result = result;
		this.param1 = param1;
		this.param2 = param2;
		this.operation = operation;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public int getParam2() {
		return param2;
	}

	public void setParam2(int param2) {
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
		return "CalOutput [result=" + result + ", param1=" + param1 + ", param2=" + param2 + ", operation=" + operation
				+ "]";
	}

	

	
	
}
