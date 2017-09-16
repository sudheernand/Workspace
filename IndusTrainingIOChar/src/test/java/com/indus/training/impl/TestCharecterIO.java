package com.indus.training.impl;

import com.indus.training.io.CharecterIO;

import junit.framework.TestCase;

public class TestCharecterIO extends TestCase {
private 	CharecterIO testObj;

	protected void setUp() throws Exception {
		testObj = new CharecterIO();
	}

	protected void tearDown() throws Exception {
		testObj = null;
	}

	public void testReadWriteCharStream() {
		testObj.readWriteCharStream("InputFile", "Output");
	}

}
