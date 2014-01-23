package com.learning.java.dont;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person1 {
	private final Date birthDate;

	public Person1(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isBabyBoomer() {
		// Unnecessary allocation of expensive object
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();
		
		return birthDate.compareTo(boomStart) >= 0
				&& birthDate.compareTo(boomEnd) < 0;
	}
}
