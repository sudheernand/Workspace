package com.indus.training.persist.entity;

public class President extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3965534171540424276L;

	public President() {
	}

	@Override
	public void setJobID(String jobID) {
		super.setJobID("AD_PRESS");
	}

}
