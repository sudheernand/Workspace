package com.indus.training.persist.impl;

public class highcharcount {

	public static void main(String[] args) {
		charcountcheck chr = new charcountcheck();

		System.out.println(chr.highcount("aabbccdddd"));

	}

}

class charcountcheck {
	public char highcount(String str) {
		char c = 0;
		int k = 0;
		int l = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					k = k + 1;
			}

			if (k >= l) {
				l = k;
				c = str.charAt(i);
			}
		}
		return c;
	}
}