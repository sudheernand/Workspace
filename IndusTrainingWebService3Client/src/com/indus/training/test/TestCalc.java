package com.indus.training.test;

import java.rmi.RemoteException;

import com.indus.training.service.CalcException;
import com.indus.training.service.CalcInputs;
import com.indus.training.service.CalcOutputs;
import com.indus.training.service.CalcWs;
import com.indus.training.service.CalcWsProxy;

public class TestCalc {

	public static void main(String[] args) {
		CalcWs calcObj = new CalcWsProxy();
		try {
			CalcOutputs calOutObj = calcObj.add(new CalcInputs(new Double(10.0), new Double(20.0)));
		} catch (CalcException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
