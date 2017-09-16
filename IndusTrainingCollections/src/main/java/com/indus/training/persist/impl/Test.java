package com.indus.training.persist.impl;

public class Test {
	public static void main(String[] args) throws Exception {
		Foo foo = new Foo(2);
		Foo copyOfFoo = createCopyOfFoo(foo);

		System.out.println(copyOfFoo);
	}

	public Test1 testinstancce() {
		Test1 tobj = new Test1();
		return tobj;
	}

	private static Foo createCopyOfFoo(Foo foo) throws CloneNotSupportedException {
		Foo clone = (Foo) foo.clone();
		return clone;
	}
}

class Foo implements Cloneable {
	private int x = 1;

	// public static Foo getinstance() {
	// Foo foObj = new Foo();
	// return foObj;
	// }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public Foo(int x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		return "Foo [x=" + x + "]";
	}

}
