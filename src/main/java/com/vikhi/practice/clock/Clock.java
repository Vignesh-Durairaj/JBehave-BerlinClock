package com.vikhi.practice.clock;

import java.util.Date;

public interface Clock {

	public int getHour(Date date);

	public int getMinute(Date date);
	
	public int getSecond(Date date);
	
	public String getHourString(Date date);
	
	public String getMinuteString(Date date);
	
	public String getSecondString(Date date);
	
	public void turnClockOn();
	
	public void turnClockOff();
	
}
