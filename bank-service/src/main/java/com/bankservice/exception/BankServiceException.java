package com.bankservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankServiceException extends Exception {

	private static final long serialVersionUID = 6458449207286014725L;

	private String errorCode;
	private String errorMessage;

}
