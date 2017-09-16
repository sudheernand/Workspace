package com.indus.training.domain;

public class Name {

	private String firstName;
	private String middleName;
	private String lastName;

	public Name() {
	}

	public Name(String fName, String mName, String lName) {
		this.firstName = fName;
		this.middleName = mName;
		this.lastName = lName;

	}

	public String getFirstName() {
		return firstName;
	}
	
    //name should never have aggregation behavior/ 
	//public void setFirstName(String firstName) {
		//this.firstName = firstName;
	//}

	public String getMiddleName() {
		return middleName;
	}

	//public void setMiddleName(String middleName) {
	//	this.middleName = middleName;
	//}

	public String getLastName() {
		return lastName;
	}

	//public void setLastName(String lastName) {
	//	this.lastName = lastName;
	//}

}
