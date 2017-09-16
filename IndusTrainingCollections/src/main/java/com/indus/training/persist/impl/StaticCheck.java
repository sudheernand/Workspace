package com.indus.training.persist.impl;

public class StaticCheck {

	public static void main(String[] args) {
		StaticVar obj = new StaticVar();
		System.out.println(obj.increment);
		obj.somemethod();
		StaticVar obj2 = new StaticVar();
		System.out.println(obj2.increment);
		obj2.somemethod();
		System.out.println(obj2.increment);

	}

}

class StaticVar {
	public static int increment = 14;

	public void somemethod() {
		increment++;
		int increment = 12;
	}
}
