package com.indus.training.domain;

public enum DayEnum {

	MONDAY("monday", "1"), TUESDAY("tuesday", "2"), WEDNESDAY("wednesday", "3"), THURSDAY("thursday",
			"4"), FRIDAY("fryday", "5"), SATURDAY("saturday", "6"), SUNDAY("sunday", "7");

	private String dayName;
	private String dayNum;

	private DayEnum(String dayName, String dayNum) {
		this.dayName = dayName;
		this.dayNum = dayNum;
	}

	public String getDayName() {
		return dayName;
	}

	public String getDayNum() {
		return dayNum;
	}

	@Override
	public String toString() {
		return "Day [dayName=" + dayName + ", dayNum=" + dayNum + "]";
	}

}
