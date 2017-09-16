
package com.indus.training.java;

public class TestMatrixmn{

	public static void main(String[] args) {
		
		Matrix mObj = new Matrix();
		double[][] param1 = { { 1, 1, 1 }, { 1, 0, 0 }, { 0, 1, 0 } };
		double[][] param2 = { { 1, 0, 1 }, { 1, 0, 1 }, { 0, 1, 1 } };
		double[][] result = mObj.mMul(param1, param2);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(result[i][j] + " ");
			}
			System.out.println();
		}

		
		double[][] result2 = mObj.mAdd(param1, param2);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(result2[i][j] + " addition");
			}
			System.out.println();

	}

}
}
