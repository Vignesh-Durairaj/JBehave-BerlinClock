package com.vikhi.practice.pojo;

public enum Light {
	RED("R"),
	YELLOW("Y"), 
	OFF("O");
	
	private String lightStr;
	
	Light(final String lightStr) {
		this.lightStr = lightStr;
	}
	
	@Override
	public String toString() {
		return this.lightStr;
	}
}
