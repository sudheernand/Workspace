package com.indus.training.service;

import com.indus.training.domain.TempInput;
import com.indus.training.domain.TempOutput;
import com.indus.training.exception.TemparatureException;
import com.indus.training.service.impl.Temparature;

import junit.framework.TestCase;

public class TestTemparature extends TestCase {
	private Temparature temObj;

	protected void setUp() throws Exception {
		temObj = new Temparature();
	}

	protected void tearDown() throws Exception {
		temObj = null;
	}

	public void testFahrenToCels() throws Exception {

		TempInput tempInObj = new TempInput();
		tempInObj.setInput1(-40.0);

		// expected result

		TempOutput expTempObj = new TempOutput();

		expTempObj.setResult(-40.0);
		expTempObj.setParam1(-40.0);
		expTempObj.setConversionUsed("FahrenHeit to celsius scale");

		// actResult

		TempOutput actTempObj = null;
		try {
			actTempObj = temObj.fahrenToCels(tempInObj);
		} catch (TemparatureException temEx) {
			temEx.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// assertion
		assertEquals(expTempObj.getResult(), actTempObj.getResult(), 0.001);
assertEquals(expTempObj.getConversionUsed(), actTempObj.getConversionUsed());
		System.out.println(+actTempObj.getResult());

	}

}
