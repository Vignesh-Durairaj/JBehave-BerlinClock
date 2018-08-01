package com.vikhi.practice.pojo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Time {

	private int hour;
	
	private int minute;
	
	private int second;

	private NumberFormat numberFormat = new DecimalFormat("00");
	
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return numberFormat.format(this.hour) + ":" 
				+ numberFormat.format(this.minute) + ":" 
				+ numberFormat.format(this.second);
	}
}
