package com.indus.training.persist.entity;

import java.io.Serializable;

public class StudentDetails implements Serializable {
	/**
	 * 
	 */
	private static long serialVersionUID = 3273270351473920945L;
	private String firstName;
	private String lastName;
	private String middleName;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	

}
