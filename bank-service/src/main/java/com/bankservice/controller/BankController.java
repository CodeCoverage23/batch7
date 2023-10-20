package com.bankservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankservice.dto.BankDetailsDto;
import com.bankservice.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bankService;

	@PostMapping("addbank")
	public String createBank(@RequestBody BankDetailsDto bankDetailsDto) {

		return null;
	}

}
