package com.bankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.bankservice.dto.BankDetailsDto;
import com.bankservice.entity.BankEntity;
import com.bankservice.service.BankService;

@RestController
public class BankController {

	private static final String SUCCESFULLY_DELETED = "Succesfully Deleted";

	@Autowired
	private BankService bankService;

	@PostMapping("addbank")
	public String createBank(@RequestBody BankDetailsDto bankDetailsDto) {
		String response = bankService.createBank(bankDetailsDto);
		return response;
	}

	@GetMapping("banks")
	public List<BankEntity> getAllBanks() {
		return bankService.getAllBanks();
	}

	@GetMapping("/bank/{id}")
	public BankDetailsDto getBankById(@PathVariable int id) {
		return bankService.getBankById(id);
	}

	@PutMapping("/bank/{id}")
	public ResponseEntity<BankDetailsDto> updateBank(@PathVariable int id, @RequestBody BankDetailsDto bankDetailsDto) {
		BankDetailsDto dto = bankService.updateBank(id, bankDetailsDto);

		return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("bank/{id}")
	public ResponseEntity<String> deleteBankById(@PathVariable int id) {
		bankService.deleteBankById(id);
		return new ResponseEntity<>(SUCCESFULLY_DELETED, HttpStatus.ACCEPTED);
	}

}
