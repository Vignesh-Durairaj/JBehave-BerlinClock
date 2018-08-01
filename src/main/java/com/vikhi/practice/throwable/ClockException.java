package com.vikhi.practice.throwable;

public class ClockException extends Exception{

	/** Generated Serial Version UID. */
	private static final long serialVersionUID = 8594757120703556403L;

	public ClockException() {
		super();
	}
	
	public ClockException(String str) {
		super(str);
	}
	
	public ClockException(Throwable cause) {
		super(cause);
	}
	
	public ClockException(String str, Throwable cause) {
		super(str, cause);
	}
	
	public ClockException(String str, Throwable cause, 
			boolean enableSuppression, 
			boolean writableStackTrace) {
		super(str, cause, enableSuppression, writableStackTrace);
	}
}
