package com.indus.training.service;

import com.indus.training.domain.ICommon;
import com.indus.training.domain.TempInputs;
import com.indus.training.domain.TempOutput;

public class TemparatureConversions  implements ICommon{

	public TempOutput conversionFC(TempInputs tempInObj) 

	{
		TempOutput temOutObj = null;
		Double param = tempInObj.getParam1();

		Double div = 1.8;
		Double sub = 32.0;
		Double celsius = 0.0;

		celsius = (param - sub) / div;
		temOutObj = new TempOutput();
		temOutObj.setResult(celsius);

		return temOutObj;

	}

	public double conversionCF(double param) {
		double mul = 1.8;
		int add = 32;
		double farenheit = 0.0;

		farenheit = (param * mul) + add;

		return farenheit;

	}
}