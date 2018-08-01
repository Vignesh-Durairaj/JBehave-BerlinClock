package com.vikhi.practive.util;

import org.apache.commons.lang.StringUtils;

import com.vikhi.practice.pojo.Time;
import com.vikhi.practice.throwable.InvalidTimeFormatException;

public class TimeUtil {

	private static final String SEPARATOR_COLON = ":";
	private static final String WHITE_SPACE = " ";
	
	private TimeUtil() {
		// Can be implemented if needed in future.
	}
	
	public static Time getTimeFromString(final String timeStr) 
			throws InvalidTimeFormatException{
		if (timeStr != null && StringUtils.isBlank(timeStr) 
				&& StringUtils.countMatches(timeStr, SEPARATOR_COLON) == 2 
				&& !timeStr.contains(WHITE_SPACE)) {
			String[] dateArray = timeStr.split(SEPARATOR_COLON);
			
			try {
				int hour = Integer.parseInt(dateArray[0]);
				int minute = Integer.parseInt(dateArray[1]);
				int second = Integer.parseInt(dateArray[2]);
				
				if (hour > 23) {
					throw new InvalidTimeFormatException("Hour value should be less then or equal to '23'");
				}
				
				if (minute > 59) {
					throw new InvalidTimeFormatException("Minute value should be less than or equal to '59'");
				}
				
				if (second > 59) {
					throw new InvalidTimeFormatException("Second value should be less than or equal to '59'");
				}
				
				return new Time(hour, minute, second);
				
			} catch (Exception e) {
				throw new InvalidTimeFormatException("Time components must be numeric");
			}
		} else {
			throw new InvalidTimeFormatException(
					"Time string " + timeStr + " is of invalid format. "
							+ "Expected format is XX:XX:XX");
		}
	}
	
	public static boolean isMidnight (final Time time) {
		return (null != time && time.toString().equals("00:00:00"));
	}
}
