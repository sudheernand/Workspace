package com.indus.training.ui;

import java.util.Hashtable;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.indus.training.service.IEmployeeDAO;

public class EmployeeUI {

	public static void main(String[] args) {

		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext;
		try {
			initContext = new InitialContext(env);
			IEmployeeDAO empDAOObj = (IEmployeeDAO) initContext
					.lookup("jndiEmployeeDAOObj#com.indus.training.service.IEmployeeDAO");
			Scanner userIn = new Scanner(System.in);
			System.out.println("enter id");
			int id = Integer.parseInt(userIn.nextLine());
			empDAOObj.find(id);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
