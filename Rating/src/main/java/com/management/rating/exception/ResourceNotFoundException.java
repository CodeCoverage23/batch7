package com.management.rating.exception;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public ResourceNotFoundException() {
		super("Resource Not Found On Server");
	}

	

	public ResourceNotFoundException(String message) {
		super(message);
	}

	

	
	
	
	
	
	
	
	
}
