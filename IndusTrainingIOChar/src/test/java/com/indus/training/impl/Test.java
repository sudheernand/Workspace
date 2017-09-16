package com.indus.training.impl;

import com.indus.training.io.CharecterIO;

public class Test {

	public static void main(String[] args) {

		CharecterIO testObj = new CharecterIO();

		testObj.readWriteCharStream("InputFile", "Output");
	}

}
