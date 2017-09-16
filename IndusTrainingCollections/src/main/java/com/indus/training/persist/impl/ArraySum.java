package com.indus.training.persist.impl;

public class ArraySum {

	public static void main(String[] args) {
		checksuma ch = new checksuma();
		int as[] = { 20, 40 ,20};
		System.out.println(ch.methsummc(as));
		;
	}

}

class checksuma {
	boolean b = false;

	public boolean methsummc(int ex[]) {
		for (int i = 0; i < ex.length; i++) {
			for (int j = 0; j < ex.length; j++) {
				for (int k = j + 1; k < ex.length; k++) {
					if (ex[i] == ex[j] + ex[k]) {
						b = true;
					}
				}

			}

		}
		return b;
	}

}