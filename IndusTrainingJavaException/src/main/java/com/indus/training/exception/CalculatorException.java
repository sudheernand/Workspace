package com.indus.training.exception;

public class CalculatorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4312163346621016794L;

	public CalculatorException() {
		super();
	}

	public CalculatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message + "custom Exception ", cause, enableSuppression, writableStackTrace);
		
	}

	public CalculatorException(String message, Throwable cause) {
		super(message + "custoom Excepion", cause);
	}

	public CalculatorException(String message) {
		super(message + "custom Exception");
	}

	public CalculatorException(Throwable cause) {
		super(cause);
	}

}
