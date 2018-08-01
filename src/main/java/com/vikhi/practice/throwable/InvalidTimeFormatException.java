package com.vikhi.practice.throwable;

public class InvalidTimeFormatException extends Exception {

	/** Generated Serial Version UID. */
	private static final long serialVersionUID = -5966342403945415017L;
	
	public InvalidTimeFormatException() {
		super();
	}
	
	public InvalidTimeFormatException(String str) {
		super(str);
	}
	
	public InvalidTimeFormatException(Throwable cause) {
		super(cause);
	}
	
	public InvalidTimeFormatException(String str, Throwable cause) {
		super(str, cause);
	}
	
	public InvalidTimeFormatException(String str, Throwable cause, 
			boolean enableSuppression, 
			boolean writableStackTrace) {
		super(str, cause, enableSuppression, writableStackTrace);
	}
}
