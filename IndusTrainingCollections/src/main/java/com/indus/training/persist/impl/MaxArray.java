package com.indus.training.persist.impl;

import java.util.Arrays;

public class MaxArray {

	public static void main(String[] args) {
		max mObj = new max();
		int[] a = { 1, 3,4,5,5};
		System.out.println(mObj.maxval(a));

	}

}

class max {
	public int maxval(int[] ex) {
		int j = 0;

		for (int i = 0; i < ex.length; i++) {
			if (ex[i] == 1) {
				j++;
			}

		}
		if (j == 1) {
			Arrays.sort(ex);
			int[] mex = Arrays.copyOfRange(ex, 1, ex.length);
			mex[0] = mex[0] + 1;
			int m = 1;
			for (int k = 0; k < mex.length; k++) {
				m = m * mex[k];
			}
			return m;

		} else {
			Arrays.sort(ex);
			int[] nEx = Arrays.copyOfRange(ex, j, ex.length);
			int m = 1;
			for (int k = 0; k < nEx.length; k++) {
				m = m * nEx[k];
			}
			m = m * j;
			return m;
		}

	}
}