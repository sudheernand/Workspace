package com.indus.training.domain;

public class Name {

	private String firstName  ;

	private String lastName;

	private String middleName;

	private String alias;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fNameParam) {
		 if (firstName == null) {
		firstName = fNameParam;
		 }
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNameParam) {
		if (lastName == null) {
			lastName = lastNameParam;
		}
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleNameParam) {
		if (middleName == null) {
			middleName = middleNameParam;
		}
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String aliasParam) {
		if (alias == null) {
			alias = aliasParam;
		}
	}

}