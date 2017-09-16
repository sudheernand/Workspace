package com.indus.training.service.impl;

import com.indus.training.domain.ConInputs;
import com.indus.training.domain.ConOutputs;
import com.indus.training.service.Converter;

import junit.framework.TestCase;

public class TestConverter extends TestCase {
	Converter Cobj;

	protected void setUp() throws Exception {
		Cobj = new Converter();
	}

	protected void tearDown() throws Exception {
		Cobj = null;

	}

	public void testConED() {
		ConInputs inObj = new ConInputs();
		ConOutputs outObj = new ConOutputs();
		double expectedResult = 1.08;
		inObj.setInput1(1);
		outObj = Cobj.conED(inObj);
		double actualResult = outObj.getResult();
		assertEquals(expectedResult, actualResult, 0);

	}
}