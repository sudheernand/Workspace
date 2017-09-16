package com.indus.training.domain;

public enum DayColourEnum {

	Monday("monday", "white"), Tuesday("tuesday", "yellow"), Wednesday("wednesday", "orange"), Thursday("thursday",
			"red"), Friday("friday", "blue"), Saturday("saturday", "voilet"), Sunday("sunday", "gold");
	private String dayName;
	private String colour;

	private DayColourEnum(String dayName, String colour) {

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
	public String toString() {
		return "DayColour [dayName=" + dayName + ", colour=" + colour + "]";
	}

}
