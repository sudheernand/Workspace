package com.indus.training.ui.model;

import org.apache.struts.action.ActionForm;

public class CalciOutput extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2613005355362630519L;
	
	private String param1;

	private String param2;

	private String operation;

	private String result;

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
