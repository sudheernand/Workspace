package com.indus.training.persist.impl;

public class Inheritanc {

	public static void main(String[] args) {
		animal anObj = new dog();

		// anObj.type();
		// dog dogObj = new dog();
		// dogObj.priv();
		// dogObj.bark();
		animal an = new animal();
		an.b = 1;
		an.a = 1;
		animal a = new animal();
		a.b = 1;
		a.a = 1;
		System.out.println(a == an);
		System.out.println(a.equals(an));

		// dog d2 = (dog) new animal();
		// d2.priv();
	}

}

class animal {
	public int a = 11;
	public int b = 2;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		animal other = (animal) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	public void type() {
		System.out.println("animal");

	}

	public void priv() {
		System.out.println(a);

	}
}

class dog extends animal {
	public dog() {
		super();
	}

	int b = 5;

	@Override
	public void type() {
		System.out.println("dog");

	}

	@Override
	public void priv() {
		System.out.println("from sub ");
	}

	public void bark() {
		System.out.println("bow wow");
	}

}