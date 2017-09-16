package com.indus.training.persist.impl;

public class TwodMatrix {

	public static void main(String[] args) {
		len lobj = new len();
		int[][] tda = { { 1, 0, 1, 1 }, { 0, 1, 1, 1 }, { 0, 1, 1, 1 } };
		System.out.println(tda[1][0]);
		lobj.lenghtfinder(tda);

	}

}

class len {
	public String lenghtfinder(int[][] ex) {
		for (int i = 0; i < ex.length; i++) {
			for (int j = 0; j < ex.length; j++)
				for (int k = 0; k < ex.length; k++)
					for (int l = 0; l < ex.length; l++)
						if ((ex[i][j]) == (ex[k][l])) {

						}
		}

		return null;
	}
}
