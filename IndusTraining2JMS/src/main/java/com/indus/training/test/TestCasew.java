package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.training.exception.JmsException;
import com.indus.training.implementation.JMSService;

public class TestCasew {
	private JMSService jmsObj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		jmsObj = new JMSService();
	}

	@After
	public void tearDown() throws Exception {
		jmsObj = null;
	}

	@Test
	public void testSendSms() throws JmsException {
		jmsObj.sendSms();

	}
}
