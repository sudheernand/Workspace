package com.indus.training.exception;

import javax.xml.ws.WebFault;

@WebFault 
public class CalcException extends Exception {

	private static final long serialVersionUID = -4793027877951751754L;

	public CalcException() {
		super();
	}

	public CalcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CalcException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalcException(String message) {
		super(message);
	}

	public CalcException(Throwable cause) {
		super(cause);
	}

}
