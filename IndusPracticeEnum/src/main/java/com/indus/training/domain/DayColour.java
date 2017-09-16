package com.indus.training.domain;

public class DayColour {

	public static final DayColour monday = new DayColour("monday", "white");
	public static final DayColour tuesday = new DayColour("tuesday", "yellow");
	public static final DayColour wednesday = new DayColour("wednesday", "orange");
	public static final DayColour thursday = new DayColour("thursday", "red");
	public static final DayColour friday = new DayColour("friday", "blue");
	public static final DayColour saturday = new DayColour("saturday", "voilet");
	public static final DayColour sunday = new DayColour("sunday", "gold");
	private String dayName;
	private String colour;

	private DayColour(String dayName, String colour) {
		super();
		this.dayName = dayName;
		this.colour = colour;
	}

	public String getDayName() {
		return dayName;
	}

	public String getColour() {
		return colour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((dayName == null) ? 0 : dayName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof DayColour))
			return false;
		DayColour other = (DayColour) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (dayName == null) {
			if (other.dayName != null)
				return false;
		} else if (!dayName.equals(other.dayName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DayColour [dayName=" + dayName + ", colour=" + colour + "]";
	}
	

}
