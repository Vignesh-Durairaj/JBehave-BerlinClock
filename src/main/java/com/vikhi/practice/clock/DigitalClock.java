package com.vikhi.practice.clock;
import static com.vikhi.practice.util.Constants.SEPARATOR_COLON;
import static com.vikhi.practice.util.Constants.SEPARATOR_HYPHEN;
import static com.vikhi.practice.util.Constants.TIME_AM;
import static com.vikhi.practice.util.Constants.TIME_PM;
import static com.vikhi.practice.util.Constants.WHITE_SPACE;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.vikhi.practice.pojo.Time;

public class DigitalClock implements Clock {

	private boolean isTurnedOn;
	
	private NumberFormat timeFormat = new DecimalFormat("00");
	
	@Override
	public void turnClockOn() {
		isTurnedOn = true;
	}

	@Override
	public void turnClockOff() {
		isTurnedOn = false;
	}

	@Override
	public String getClockDisplayVal(Time time) {
		
		int hour = time.getHour();
		return 
				(isTurnedOn ? String.valueOf(hour == 0 ? 12 : (hour > 12 ? hour-12 : hour)) : SEPARATOR_HYPHEN + SEPARATOR_HYPHEN) 
				+ SEPARATOR_COLON + 
				(isTurnedOn ? timeFormat.format(time.getMinute()) : SEPARATOR_HYPHEN + SEPARATOR_HYPHEN)
				+ SEPARATOR_COLON + 
				(isTurnedOn ? timeFormat.format(time.getSecond()) : SEPARATOR_HYPHEN + SEPARATOR_HYPHEN)
				+ WHITE_SPACE + 
				(isTurnedOn ? (hour < 12 ? TIME_AM : TIME_PM) : SEPARATOR_HYPHEN);
		
	}

}
