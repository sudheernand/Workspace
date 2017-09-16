package com.indus.training.domain;

public class FullName {
	private String firstName;
	private String lastName;
	private String middleName;
	private String maidenName;

	public FullName() {
		super();

	}

	public FullName(String firstName, String lastName, String middleName, String maidenName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.maidenName = maidenName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;

	}

	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", maidenName=" + maidenName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((maidenName == null) ? 0 : maidenName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof FullName))
			return false;
		FullName other = (FullName) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (maidenName == null) {
			if (other.maidenName != null)
				return false;
		} else if (!maidenName.equals(other.maidenName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		return true;
	}

}
