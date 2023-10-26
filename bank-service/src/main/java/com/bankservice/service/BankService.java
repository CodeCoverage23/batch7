package com.bankservice.service;

import java.util.List;

import com.bankservice.dto.BankDetailsDto;
import com.bankservice.entity.BankEntity;

public interface BankService {

	String createBank(BankDetailsDto bankDetailsDto);

	List<BankEntity> getAllBanks();

	BankDetailsDto getBankById(int bankId);
}
