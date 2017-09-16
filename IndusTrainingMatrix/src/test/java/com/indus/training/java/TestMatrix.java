package com.indus.training.java;

import junit.framework.TestCase;

public class TestMatrix extends TestCase {
	private Matrix mObj;

	protected void setUp() throws Exception {
		mObj = new Matrix();
		
	}

	protected void tearDown() throws Exception {
	mObj =null;
	}

	public void testMMul() {
		double[][] input1 = {{1,0},{1,1}};
		double[][] input2 = {{1,2},{2,1}};
		double[][] expectedResult = {{3,3},{1,2}};
		double[][] actualResult = mObj.mMul(input1, input2);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				assertEquals(expectedResult[i][j], actualResult[i][j], 0);
			}
		}
	}

	public void testMAdd() {
		double[][] input1 = {{1,0},{1,1}};
		double[][] input2 = {{1,2},{2,1}};
		double[][] expectedResult = {{2,2},{3,2}};
		double[][] actualResult = mObj.mAdd(input1, input2);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				assertEquals(expectedResult[i][j], actualResult[i][j], 0);
	}

}
	}
}