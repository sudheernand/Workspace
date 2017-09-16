package com.indus.training.exception;

public class JndiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2396752741622190678L;

	public JndiException() {
		super();
	}

	public JndiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public JndiException(String message, Throwable cause) {
		super(message, cause);
	}

	public JndiException(String message) {
		super(message);
	}

	public JndiException(Throwable cause) {
		super(cause);
	}

}
