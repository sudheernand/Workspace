package com.indus.training.persist.entity;

public class SalesManager extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4552739990902328459L;

	public SalesManager() {
		System.out.println("message from sales manger constructor ");
	}

	@Override
	public void setJobID(String jobID) {
		super.setJobID("SA_MAN");
	}

}
