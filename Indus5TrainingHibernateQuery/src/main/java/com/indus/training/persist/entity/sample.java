package com.indus.training.persist.entity;

public class sample {


	public boolean reverse(String example) {
		String rev = new String();
		char[] store = new char[example.length()];
		for (int i = 0; i < example.length(); i++) {

			char a = example.charAt(i);
			store[i] = a;
		}
		for (int i = store.length - 1; i >= 0; i--) {

			char a = example.charAt(i);
			rev = rev + a;

		}

		for (int i = 0; i < example.length(); i++) {
			for (int j = i + 1; j < example.length(); j++) {
				if (store[i] == store[j]) {
					int a = 10;
					a= 30;
					a= a+5;
					StringBuffer b = new StringBuffer("NEW");
					System.out.println(b.hashCode() );
					b.append("sd");
					System.out.println(store[i]);
					System.out.println(b.hashCode() );
				}

			}
		}
		System.out.println(rev);
		return rev.equals(example);
	}
}