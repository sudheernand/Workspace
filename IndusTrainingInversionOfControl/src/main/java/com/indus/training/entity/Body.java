package com.indus.training.entity;

public class Body {
	private String bodyType;

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "Body [bodyType=" + bodyType + "]";
	}

}
