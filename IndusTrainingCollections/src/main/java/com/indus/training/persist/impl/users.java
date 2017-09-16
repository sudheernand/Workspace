package com.indus.training.persist.impl;

public class users implements Comparable<users> {
	public String firstname;
	public String lastname;

	public int compareTo(users o) {
		return this.firstname.compareTo(o.firstname);
		// return this.firstname.compareToIgnoreCase(o.firstname);
	}

	@Override
	public String toString() {
		return "users [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
