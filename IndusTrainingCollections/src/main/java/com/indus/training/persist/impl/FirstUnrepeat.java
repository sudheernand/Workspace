package com.indus.training.persist.impl;

public class FirstUnrepeat {

	public static void main(String[] args) {
		String s = "aabbcctdeefgh";
		unrep df = new unrep();
		System.out.println(df.urepprint(s));

	}

}

class unrep {
	public char urepprint(String sr) {

		for (int i = 0; i < sr.length(); i++) {
			int k = 0;
			for (int j = 0; j < sr.length(); j++) {

				if (sr.charAt(i) == sr.charAt(j)) {
					k = k + 1;
				}

			}
			if (k == 1) {
				return sr.charAt(i);
			}
		}
		return 0;

	}
}
