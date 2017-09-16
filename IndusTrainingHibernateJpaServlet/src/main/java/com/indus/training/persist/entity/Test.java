package com.indus.training.persist.entity;

public class Test {

	public static void main(String[] args) {
		test2 ts = new test2();
		ts.pr(7);

	}

}

class test2 {
	public void pr(int n) {

		for (int i = 1; i <= n; i = i + 2) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = n; j >= 1; j = j - 2) {

			for (int k = 0; k < j-2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}