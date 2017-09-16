package com.indus.training.ui.model;

import org.apache.struts.action.ActionForm;

/***
 * 
 * @author sudheer Description : has all the input variables and methods to set
 *         and get data those of type private
 *
 */

public class CalcInputs extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1194438278652662605L;
	/***
	 * has input variables
	 */

	private String param1;

	private String param2;

	private String operation;

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

	
	
	

	

}
