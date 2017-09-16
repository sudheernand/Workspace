package com.indus.training.persist.entity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.StringTokenizer;

public class PersonDetails implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8810746689521917855L;
	private String firstname;
	private String middlename;
	private String lastname;
	private String id;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((middlename == null) ? 0 : middlename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PersonDetails))
			return false;
		PersonDetails other = (PersonDetails) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (middlename == null) {
			if (other.middlename != null)
				return false;
		} else if (!middlename.equals(other.middlename))
			return false;
		return true;
	}

	// @Override
	// public String toString() {
	// return "\"firstname\":\"" + firstname + "\",\"middlename\":\"" +
	// middlename + "\",\"lastname\":\"" + lastname
	// + "\",\"id\":\"" + id + "\"";
	// }
	// <?xml version="1.0" encoding="UTF-8"?>
	// <firstName></firstName>
	// <middleName></middleName>
	// <lastName></lastName>
	// <id></id>

	@Override
	public String toString() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n <firstName>" + firstname + "</firstName> \n <middleName>"
				+ middlename + "</middleName> \n <lastName>" + lastname + "</lastName> \n <id>" + id + "</id> ";
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(toString());

	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// String read = (String) in.readObject();
		//
		//
		// System.out.println(read);

		System.out.println(in.readObject());

	}

}
