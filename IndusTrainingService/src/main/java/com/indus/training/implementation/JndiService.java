package com.indus.training.implementation;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Queue;

import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.indus.training.entity.Contact;
import com.indus.training.exception.JndiException;
import com.indus.training.service.IJndiService;

public class JndiService implements IJndiService {

	public boolean bind(Contact conObj) throws JndiException {
		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext;
		try {
			initContext = new InitialContext(env);
			String name = conObj.getFirstname();
			initContext.bind("one", "hi");
		} catch (NamingException e) {
			e.printStackTrace();
		}

		return true;
	}

	public boolean unbind(String id) throws Exception {
		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext;
		try {
			initContext = new InitialContext(env);

			initContext.unbind(id);
		} catch (NamingException e) {
			e.printStackTrace();
		}

		return true;

	}

	public String lookup(String id) throws Exception {
		String result = null;
		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext;
		try {
			initContext = new InitialContext(env);

			result = (String) initContext.lookup(id);

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return result;

	}

	public boolean rebind(String id, String value ) throws Exception {
		String result = null;
		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext;
		try {
			initContext = new InitialContext(env);

			initContext.rebind(id, value);
			;

		} catch (NamingException e) {
			e.printStackTrace();
		}

		return true;
	}

}
