package com.bankservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BankServiceException.class)
	public ResponseEntity<String> invalidBankException(BankServiceException exception) {
		return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.NOT_FOUND);
	}
	
	/*
	 * @ExceptionHandler(RuntimeException.class) public ResponseEntity<String>
	 * runBankException(RuntimeException exception) { return new
	 * ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND); }
	 */
}
