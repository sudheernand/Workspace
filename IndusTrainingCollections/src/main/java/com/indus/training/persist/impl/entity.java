package com.indus.training.persist.impl;

public class entity {
	public String name;
	public int age;
	public Integer heigth;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((heigth == null) ? 0 : heigth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		entity other = (entity) obj;
		if (age != other.age)
			return false;
		if (heigth == null) {
			if (other.heigth != null)
				return false;
		} else if (!heigth.equals(other.heigth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
