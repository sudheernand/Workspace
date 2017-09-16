package com.indus.training.service;

import java.util.Hashtable;

import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Session Bean implementation class SenderJms
 */
@Stateless(mappedName = "jndiSenderJmsObj")
public class SenderJms implements ISenderJms {

	/**
	 * Default constructor.
	 */
	private static ConnectionFactory conFact;
	private static Queue queueObj;

	public void SenderJms(String id) {
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
			MessageProducer producer = sessionObj.createProducer(dest);
			TextMessage msg = sessionObj.createTextMessage();
			msg.setText(id);
			producer.send(msg);
			producer.send(sessionObj.createMessage());

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

	}

}
