package com.bankservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankDetailsDto {

	private int id;
	private String bankName;
	private String bankAddress;
	private String bankIFSC;
	private String bankCode;
}
