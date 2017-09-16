package com.indus.training.service;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCalculator.class);
		suite.addTestSuite(TestTemparature.class);
		//$JUnit-END$
		return suite;
	}

}
