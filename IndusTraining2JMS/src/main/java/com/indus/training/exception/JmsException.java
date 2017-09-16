package com.indus.training.exception;

public class JmsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2396752741622190678L;

	public JmsException() {
		super();
	}

	public JmsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public JmsException(String message, Throwable cause) {
		super(message, cause);
	}

	public JmsException(String message) {
		super(message);
	}

	public JmsException(Throwable cause) {
		super(cause);
	}

}
