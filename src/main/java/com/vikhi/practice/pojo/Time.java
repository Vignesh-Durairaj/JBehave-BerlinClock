package com.vikhi.practice.pojo;

public class Time {

	private int hour;
	
	private int minute;
	
	private int second;

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
		return this.hour + ":" + this.minute + ":" + this.second;
	}
}
