package com.indus.training.java;

public class Matrix {
	public double[][] mMul(double[][] param1, double[][] param2)

	{
		double[][] result = new double[3][3];

		for (int i = 0; i < param1.length; i++) {
			for (int j = 0; j < param2.length; j++)
				result[i][j] += param1[i][j] * param2[i][j];
		}
		return result;

	}

	public double[][] mAdd(double[][] param1, double[][] param2)

	{
		double[][] result = new double[3][3];

		for (int i = 0; i < param1.length; i++) {
			for (int j = 0; j < param2.length; j++)
				result[i][j] = param1[i][j] + param2[i][j];
		}
		return result;
	}
}