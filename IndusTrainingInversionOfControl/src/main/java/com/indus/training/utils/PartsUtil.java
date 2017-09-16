package com.indus.training.utils;

import com.indus.training.entity.Body;
import com.indus.training.entity.Car;
import com.indus.training.entity.Tyre;

public class PartsUtil {
	private static PartsUtil pUtilsObj = new PartsUtil();

	private PartsUtil() {
	}

	public static PartsUtil getInstance() {
		return pUtilsObj;
	}

	public Tyre getTyre(String tName) {

		Tyre tyreObj = new Tyre();
		tyreObj.setTyreType(tName);
		return tyreObj;

	}

	public Body getBody(String bName) {
		Body bodyObj = new Body();
		bodyObj.setBodyType(bName);
		return bodyObj;
	}

	public Car getHondaCar() {
		Car carObj = new Car();
		carObj.setBodyObj(PartsUtil.getInstance().getBody("Honda body"));
		carObj.setTyreObj(PartsUtil.getInstance().getTyre("Honda Tyre"));

		return carObj;
	}

	public Car getToyotaCar() {
		Car carObj = new Car();
		carObj.setBodyObj(PartsUtil.getInstance().getBody("Toyota body"));
		carObj.setTyreObj(PartsUtil.getInstance().getTyre("Toyota Tyre"));

		return carObj;
	}
}
