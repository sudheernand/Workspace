package com.indus.training.exception;

public class TemparatureException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7403560534599162540L;

	public TemparatureException() {
		super();
	}

	public TemparatureException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message +"custom exception", cause, enableSuppression, writableStackTrace);
	}

	public TemparatureException(String message, Throwable cause) {
		super(message +" custom message", cause);
	}

	public TemparatureException(String message) {
		super(message+ "custom message");
	}

	public TemparatureException(Throwable cause) {
		super(cause);
	}
	

}
