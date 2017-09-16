package com.indus.training.persist.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConArr {

	public static void main(String[] args) {
		int[] arr = { 12, 14, 1, 2, 3, 7, 3, 4, 5, 6, 7, 8,12,1,2,3,4,5,6,7,8,9 };
		SendArr sObj = new SendArr();
		System.out.println(sObj.arrtest(arr));

	}

}

class SendArr {
	public int arrtest(int[] ex) {
		int m = 1;
		List<Integer> lisObj = new ArrayList<Integer>();
		for (int i = 0; i < ex.length; i++) {
			if (i == ex.length - 1) {
				if (m > 1) {
					lisObj.add(m);

				}

			}

			else if (((i != ex.length - 1) && (ex[i + 1] - ex[i]) == 1)) {
				m = m + 1;
			} else if (((ex[i + 1] - ex[i]) != 1) && m > 1) {
				int b = m;

				lisObj.add(b);
				m = 1;

			} else {

			}

		}
		Collections.sort(lisObj);
		return lisObj.get(lisObj.size() - 1);

	}
}