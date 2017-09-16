package com.indus.training.persist.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class userstest {

	public static void main(String[] args) {
		users one = new users();
		one.firstname = "aa";
		one.lastname = "asd";
		users two = new users();
		two.firstname = "Bb";
		two.lastname = "abd";

		List<users> list = new ArrayList<users>();
		list.add(two);
		list.add(one);

		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}
