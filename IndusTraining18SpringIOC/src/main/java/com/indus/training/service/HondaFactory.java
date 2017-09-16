package com.indus.training.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.domain.spec.IHondaBody;
import com.indus.training.domain.spec.IHondaCar;
import com.indus.training.domain.spec.IHondaEngine;
import com.indus.training.domain.spec.ISeat;
import com.indus.training.domain.spec.ITyre;

public class HondaFactory {

	public HondaFactory() {
	}

	private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "SpringIoc.xml" });

	public static IHondaCar manfactureCarWithIOC() {
		IHondaCar myCar = null;

		IHondaEngine myCarEngine = (IHondaEngine) context.getBean("engineBean");

		IHondaBody myCarBody = (IHondaBody) context.getBean("bodyBean");

		ISeat seat1 = (ISeat) context.getBean("seatBean");
		ISeat seat2 = (ISeat) context.getBean("seatBean");
		ISeat seat3 = (ISeat) context.getBean("seatBean");
		ISeat seat4 = (ISeat) context.getBean("seatBean");

		ISeat seats[] = { seat1, seat2, seat3, seat4 };

		ITyre tyre1 = (ITyre) context.getBean("tyreBean");
		ITyre tyre2 = (ITyre) context.getBean("tyreBean");
		ITyre tyre3 = (ITyre) context.getBean("tyreBean");
		ITyre tyre4 = (ITyre) context.getBean("tyreBean");

		ITyre tyres[] = { tyre1, tyre2, tyre3, tyre4 };

		myCar = (IHondaCar) context.getBean("carBean");
		myCar.setBody(myCarBody);
		myCar.setEngine(myCarEngine);
		myCar.setSeats(seats);
		myCar.setTyres(tyres);

		return myCar;
	}

}
