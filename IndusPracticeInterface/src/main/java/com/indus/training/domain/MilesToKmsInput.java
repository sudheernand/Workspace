package com.indus.training.domain;

public class MilesToKmsInput implements IMilesToKmsInput{
	private double input1;
	private double result;
	
	
	public MilesToKmsInput() {
		super();
		
	}
	public MilesToKmsInput(double input1, double result) {
		super();
		this.input1 = input1;
		this.result = result;
	}
	@Override
	public String toString() {
		return "MilesToKmsInput [input1=" + input1 + ", result=" + result + "]";
	}
	public double getInput1() {
		return input1;
	}
	public void setInput1(double input1) {
		this.input1 = input1;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	
	

}
