package com.indus.training.persist.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		int a;
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(23);
		obj.add(34);
		Iterator<Integer> itobj = obj.iterator();
		System.out.println(itobj.next());
		System.out.println(itobj.next());
		System.out.println(itobj.next());

		some2 sobj = new some2();
		System.out.println(sobj.b.hashCode());
		System.out.println(sobj.b.replace("h", "g"));
		System.out.println(sobj.b.toUpperCase());
		System.out.println(sobj.b);
		System.out.println(sobj.b.hashCode());
		// sobj.a = 8;
		System.out.println(sobj.a);
		System.out.println(sobj.iObj.hashCode());
		sobj.iObj.a = 5;
		System.out.println(sobj.iObj.hashCode());

	}

}

class some2 {
	public final int a = 4;
	public final some iObj = new some();
	public final String b = "ggh";

}