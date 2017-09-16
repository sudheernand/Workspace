package com.indus.training.persist.impl;

import java.util.Date;

public class Sub extends Super {

	private final Date date; // Blank final, set by constructor
	Sub() {
	date = new Date();
	}
	@Override public void overrideMe() {
	System.out.println(date);
	}
	public static void main(String[] args) {
	Sub sub = new Sub();
	sub.overrideMe();
	}

}
 class Super {
	// Broken - constructor invokes an overridable method
	public Super() {
	overrideMe();
	}
	public void overrideMe() {
		System.out.println("super");
	}
	}
