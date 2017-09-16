package com.indus.service;

public class Test {

	public static void main(String[] args) {

		SampleThread sampleThreadObj = new SampleThread();
		sampleThreadObj.start();
		
		
		Thread runnableThread = new Thread(sampleThreadObj);
		SampleThread2 sampleThread2Obj = new SampleThread2();
		runnableThread.start();

	}

}
