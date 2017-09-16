package com.indus.training.java;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator calObj = new Calculator();
		calObj.setInput1(10.00);
		calObj.setInput2(30.0);
		
		double addition = calObj.getInput1()+calObj.getInput2();
		double substraction = calObj.getInput1()-calObj.getInput2();
		double multiplication = calObj.getInput1()*calObj.getInput2();
		double division = calObj.getInput1()/calObj.getInput2();
		
		
		System.out.println(""+ addition);
		
		
}

}
