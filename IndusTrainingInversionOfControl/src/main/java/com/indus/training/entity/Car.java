package com.indus.training.entity;

public class Car {
	private Tyre tyreObj;
	private Body bodyObj;

	public Tyre getTyreObj() {
		return tyreObj;
	}

	public void setTyreObj(Tyre tyreObj) {
		this.tyreObj = tyreObj;
	}

	public Body getBodyObj() {
		return bodyObj;
	}

	public void setBodyObj(Body bodyObj) {
		this.bodyObj = bodyObj;
	}

	@Override
	public String toString() {
		return "Car [tyreObj=" + tyreObj + ", bodyObj=" + bodyObj + "]";
	}

}
