package com.indus.traiing.ioc;

import com.indus.training.domain.spec.IHondaCar;
import com.indus.training.service.HondaFactory;

public class TestIOC {

	public TestIOC() {
	}

	public static void main(String[] args) {

		IHondaCar myCar = HondaFactory.manfactureCarWithIOC();
		myCar.drive();
	}

}
