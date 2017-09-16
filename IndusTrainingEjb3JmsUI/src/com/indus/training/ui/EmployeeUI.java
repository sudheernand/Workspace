package com.indus.training.ui;

import java.util.Hashtable;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.indus.training.service.IEmployeeDAOJMS;
import com.indus.training.service.IReceiverJms;
import com.indus.training.service.ISenderJms;

public class EmployeeUI {

	public static void main(String[] args) {

		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Context initContext;
		try {
			initContext = new InitialContext(env);
//			IEmployeeDAOJMS empDAOObj = (IEmployeeDAOJMS) initContext
//					.lookup("jndiEmployeeDAOJMSObj#com.indus.training.service.IEmployeeDAOJMS");
//			ISenderJms senderObj = (ISenderJms) initContext
//					.lookup("jndiSenderJmsObj#com.indus.training.service.ISenderJms");
//			Scanner userIn = new Scanner(System.in);
//			System.out.println("enter id");
//			String id = userIn.nextLine();
//			senderObj.SenderJms(id);
			IReceiverJms recieverObj = (IReceiverJms) initContext
					.lookup("jndiReceiverObj#com.indus.training.service.IReceiverJms");
			recieverObj.ReceiverJms();

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
