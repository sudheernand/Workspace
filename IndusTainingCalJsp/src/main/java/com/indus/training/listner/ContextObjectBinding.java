package com.indus.training.listner;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class ContextObjectBinding
 *
 */
public class ContextObjectBinding implements HttpSessionBindingListener {

	/**
	 * Default constructor.
	 */
	public ContextObjectBinding() {
		System.out.println("");
	}

	/**
	 * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
	 */
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("valueBond method ");
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("valueUnbound method");
	}

}
