package com.indus.training.entity;

import java.io.Serializable;

public class Contact implements Serializable {

	private static final long serialVersionUID = 3478623828067515739L;
	private String firstname;
	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
