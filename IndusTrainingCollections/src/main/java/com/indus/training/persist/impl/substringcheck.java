package com.indus.training.persist.impl;

public class substringcheck {

	public static void main(String[] args) {
		checker ch = new checker();
		System.out.println(ch.checksstring("abcde"));

	}

}

class checker {
	String s = "axbcde";

	public boolean checksstring(String ex) {
		int k = 0;
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (j < ex.length() && s.charAt(i) == ex.charAt(j)) {
				k = k + 1;
				j = j + 1;
				if (k == ex.length()) {
					return true;
				}
			}

		}

		return false;

	}
}