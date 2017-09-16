package com.indus.training.java;

import com.indus.training.service.CalOutput;
import com.indus.training.domain.Calculator;


public class TestCalculator {

	public static void main(String[] args) {
		CalOutput coutObj = new CalOutput();
		Calculator caObj = new Calculator();
		caObj.setInput1(3.00);
		caObj.setInput2(4.0);
		
		System.out.println("addition of numbers is:" +coutObj.add(caObj));
		
		
		
		
	

	}

}
