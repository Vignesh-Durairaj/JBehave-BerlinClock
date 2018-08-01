package com.vikhi.practice.clock;

import com.vikhi.practice.pojo.Time;

public interface Clock {

	public void turnClockOn();
	
	public void turnClockOff();
	
	public String getClockDisplayVal(Time time);
	
}
