package com.bankservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankDetailsDto {

	private int id;
	private String bankName;
	private String bankAddress;
	private String bankIFSC;
	private String bankCode;
}
