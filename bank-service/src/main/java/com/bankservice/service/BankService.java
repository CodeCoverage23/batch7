package com.bankservice.service;

import java.util.List;

import com.bankservice.dto.BankDetailsDto;
import com.bankservice.entity.BankEntity;

/**
 * This is an bank service interface
 */
public interface BankService {

	String createBank(BankDetailsDto bankDetailsDto);

	/**
	 * This method will return all banks from DB
	 * 
	 * @return BankEntity The list of bank entities
	 */
	List<BankEntity> getAllBanks();

	BankDetailsDto getBankById(int bankId);

	/**
	 * This method is used to update the bank in DB
	 * 
	 * @param bankId         The bank Id(DB Id)
	 * @param bankDetailsDto The bank details DTO
	 * @return {@link BankDetailsDto} Updated Bank
	 */
	BankDetailsDto updateBank(int bankId, BankDetailsDto bankDetailsDto);

	/**
	 * This method is used to delete the bank in DB
	 */
	void deleteBankById(int id);

}
