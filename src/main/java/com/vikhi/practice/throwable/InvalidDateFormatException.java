package com.vikhi.practice.throwable;

public class InvalidDateFormatException extends Exception {

	/** Generated Serial Version UID. */
	private static final long serialVersionUID = -5966342403945415017L;
	
	public InvalidDateFormatException() {
		super();
	}
	
	public InvalidDateFormatException(String str) {
		super(str);
	}
	
	public InvalidDateFormatException(Throwable cause) {
		super(cause);
	}
	
	public InvalidDateFormatException(String str, Throwable cause) {
		super(str, cause);
	}
	
	public InvalidDateFormatException(String str, Throwable cause, 
			boolean enableSuppression, 
			boolean writableStackTrace) {
		super(str, cause, enableSuppression, writableStackTrace);
	}
}
