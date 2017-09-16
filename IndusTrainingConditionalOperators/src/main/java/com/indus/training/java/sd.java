package com.indus.training.java;

import java.sql.Date;
import java.util.Calendar;
import java.util.TimeZone;

public class sd {

	private final Date birthDate = null;
	// Other fields, methods, and constructor omitted
	/**
	* The starting and ending dates of the baby boom.
	*/
	private static Date BOOM_START;
	private static final Date BOOM_END;
	static {
	Calendar gmtCal =
	Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
	BOOM_START = (Date) gmtCal.getTime();
	gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
	BOOM_END = (Date) gmtCal.getTime();
	}
	public boolean isBabyBoomer() {
		
		BOOM_START = null;
	return birthDate.compareTo(BOOM_START) >= 0 &&
	birthDate.compareTo(BOOM_END)
	< 0;
	
	
	}
}
