package com.indus.training.domain;

public class TestState {

	public static void main(String[] args) {

		Name myName = new Name();

		myName.setFirstName("sudheer");
		System.out.println(" " + myName.getFirstName());

		myName.setFirstName("puppala");

		System.out.println(" " + myName.getFirstName());
		myName.setLastName("renukunta");
		System.out.println(" " + myName.getLastName());
		

	}

}