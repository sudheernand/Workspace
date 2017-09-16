package com.indus.training.implementation;

import java.util.Hashtable;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.indus.training.exception.JmsException;
import com.indus.training.service.IJMSReciever;

public class JMSReciever implements IJMSReciever {
	private static ConnectionFactory conFact;
	private static Queue queueObj;

	public boolean reciever() throws JmsException {
		Hashtable env = new Hashtable();
		env.put(Context.PROVIDER_URL, "t3://localhost:9010/");
		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		Connection connObj = null;
		Session sessionObj = null;
		Context initContext = null;
		;
		try {
			initContext = new InitialContext(env);
			conFact = (ConnectionFactory) initContext.lookup("JNDIIndusQueConnectionFac");
			queueObj = (Queue) initContext.lookup("JNDIIndusQue");

			connObj = conFact.createConnection();
			sessionObj = connObj.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination dest = queueObj;
			MessageConsumer consumer = sessionObj.createConsumer(dest);
			TextMessage message = sessionObj.createTextMessage();

			connObj.start();

			while (true) {
				Message m = consumer.receive(1);
				if (m != null) {
					if (m instanceof TextMessage) {
						message = (TextMessage) m;
						System.out.println("Reading message: " + message.getText());
					} else {
						break;
					}
				}
			}

		} catch (JMSException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			if (sessionObj != null) {
				try {
					sessionObj.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}

			}
			if (connObj != null) {
				try {
					connObj.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}

			}
			if (initContext != null) {

				try {
					initContext.close();
				} catch (NamingException e) {
					e.printStackTrace();
				}

			}
		}
		return true;
	}

}
