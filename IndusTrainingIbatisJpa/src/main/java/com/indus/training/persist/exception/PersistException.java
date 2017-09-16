package com.indus.training.persist.exception;

public class PersistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5722382033383099728L;

	public PersistException() {
		super();
	}

	public PersistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersistException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersistException(String message) {
		super(message);
	}

	public PersistException(Throwable cause) {
		super(cause);
	}

}
