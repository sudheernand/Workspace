package com.indus.training.persist.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class PersonssDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3740594167765697969L;
	private String firstname;
	private String midlleName;
	private String lastName;
	private String id;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMidlleName() {
		return midlleName;
	}

	public void setMidlleName(String midlleName) {
		this.midlleName = midlleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PersonssDetails [firstname=" + firstname + ", midlleName=" + midlleName + ", lastName=" + lastName
				+ ", id=" + id + "]";
	}
	



}
