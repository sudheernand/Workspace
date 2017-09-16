package com.indus.training.persist.exception;

public class PersistanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5722382033383099728L;

	public PersistanceException() {
		super();
	}

	public PersistanceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersistanceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersistanceException(String message) {
		super(message);
	}

	public PersistanceException(Throwable cause) {
		super(cause);
	}

}
