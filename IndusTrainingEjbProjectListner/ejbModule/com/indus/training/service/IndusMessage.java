package com.indus.training.service;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: IndusMessage
 */
@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") })
public class IndusMessage implements MessageListener {

	/**
	 * Default constructor.
	 */
	public IndusMessage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */

	public void onMessage(Message message) {

		TextMessage txMessage = (TextMessage) message;
		try {
			System.out.println("MDB Reading message: " + txMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
