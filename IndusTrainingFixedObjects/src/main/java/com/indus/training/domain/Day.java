package com.indus.training.domain;

public class Day {

	public static final Day monday = new Day("monday", "1");
	public static final Day tusday = new Day("tuesday", "2");
	public static final Day wednesday = new Day("wednesday", "3");
	public static final Day thursday = new Day("thursday", "4");
	public static final Day friday = new Day("friday", "5");
	public static final Day saturday = new Day("saturday", "6");
	public static final Day sunday = new Day("sunday", "7");

	private String dayName;
	private String dayNum;

	private Day(String dayName, String dayNum) {
		super();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayName == null) ? 0 : dayName.hashCode());
		result = prime * result + ((dayNum == null) ? 0 : dayNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Day))
			return false;
		Day other = (Day) obj;
		if (dayName == null) {
			if (other.dayName != null)
				return false;
		} else if (!dayName.equals(other.dayName))
			return false;
		if (dayNum == null) {
			if (other.dayNum != null)
				return false;
		} else if (!dayNum.equals(other.dayNum))
			return false;
		return true;
	}

}
