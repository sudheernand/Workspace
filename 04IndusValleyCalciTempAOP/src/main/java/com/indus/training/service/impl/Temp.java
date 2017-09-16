package com.indus.training.service.impl;

import com.indus.training.domain.TempIn;
import com.indus.training.domain.TempOut;
import com.indus.training.service.ICalci;
import com.indus.training.service.ITemp;

public class Temp implements ITemp {

	private ICalci calObj;

	public void setCalObj(ICalci calObj) {
		this.calObj = calObj;
	}

	public TempOut cToF(TempIn tempInObj) {

		// (C * 9/5) + 32

		TempOut tempObj = new TempOut();

		tempObj.setResult((calObj.multiply(tempInObj.getTemp(), 1.8)) + 32);
		tempObj.setTemp(tempInObj.getTemp());

		return tempObj;
	}

	public TempOut fToC(TempIn tempInObj) {

		// (F - 32) * 5/9
		TempOut tempObj = new TempOut();

		tempObj.setResult((calObj.subtract(tempInObj.getTemp(), 32)) * 0.55);
		tempObj.setTemp(tempInObj.getTemp());

		return tempObj;
	}

}
