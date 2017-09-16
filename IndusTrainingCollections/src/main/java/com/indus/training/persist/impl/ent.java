package com.indus.training.persist.impl;

public class ent {

	public static void main(String[] args) {
		entity eObj = new entity();
		eObj.age = 10;
		eObj.heigth = 11;
		eObj.name = "nvc";
		Entity2 e2Obj = new Entity2();
		e2Obj.age = 10;
		e2Obj.heigth = 11;
		e2Obj.name = "nvc";
		System.out.println(eObj.equals(e2Obj));
		System.out.println((int) eObj.age);
		System.out.println((int) 118);
		System.out.println(eObj.hashCode());
		System.out.println(e2Obj.hashCode());

		;

	}

}
