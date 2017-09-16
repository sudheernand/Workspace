package com.indus.training.test;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.service.ICalc;

public class TestCalc {
	private ICalc calObj;

	@Before
	public void setUp() throws Exception {
		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext;
		try {
			initContext = new InitialContext(env);
//			calObj = (ICalc) initContext.lookup("jndiCalcObj#com");
			calObj = (ICalc) initContext.lookup("jndiCalcObj#com.indus.training.service.ICalc");

		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

	@After
	public void tearDown() throws Exception {
		calObj = null;
	}

	@Test
	public void test() {
		CalcInputs calIn = new CalcInputs();
		calIn.setInput1(20);
		calIn.setInput2(30);
		CalcOutputs calout = new CalcOutputs();
		calout = calObj.add(calIn);
		System.out.println(calout.getResult());

	}

}
