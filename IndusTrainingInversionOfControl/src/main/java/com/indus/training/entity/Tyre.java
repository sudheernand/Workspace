package com.indus.training.entity;

public class Tyre {
	private String tyreType;

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	@Override
	public String toString() {
		return "Tyre [tyreType=" + tyreType + "]";
	}

}
