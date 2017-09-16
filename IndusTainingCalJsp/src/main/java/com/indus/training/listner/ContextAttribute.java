package com.indus.training.listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Application Lifecycle Listener implementation class ContextAttribute
 *
 */
public class ContextAttribute implements ServletContextAttributeListener {

	/**
	 * Default constructor.
	 */
	public ContextAttribute() {
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent scab) {
		System.out.println("attribute added");
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		System.out.println("attribute removed");
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		System.out.println("attribute replaced");
	}

}
