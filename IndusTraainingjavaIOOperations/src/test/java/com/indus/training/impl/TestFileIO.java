/**
 * 
 */
package com.indus.training.impl;

import com.indus.training.io.FileIO;

import junit.framework.TestCase;

public class TestFileIO extends TestCase {
	FileIO testObj;

	protected void setUp() throws Exception {
		testObj = new FileIO();
	}

	protected void tearDown() throws Exception {
		testObj = null;
	}

	public void testReadFromSourceWriteToDest() {
		testObj.readFromSourceWriteToDest("InputFile", "OutputFile");
	}

}
