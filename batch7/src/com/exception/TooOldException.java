package com.exception;

public class TooOldException extends RuntimeException {
	
	TooOldException(String msg) {
		super(msg);
	}
}
