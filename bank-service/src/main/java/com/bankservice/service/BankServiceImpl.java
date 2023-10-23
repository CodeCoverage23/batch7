package com.bankservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankservice.dto.BankDetailsDto;
import com.bankservice.entity.BankEntity;
import com.bankservice.repository.BankRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BankServiceImpl implements BankService {

	private static final String SUCCESFULLY_SAVED = "Succesfully Saved";
	
	@Autowired
	private BankRepository bankRepository;
	
	@Override
	public String createBank(BankDetailsDto bankDetailsDto) {
		log.info("createBank mehtod Started");
		log.info("Bank Details DTO : {}", bankDetailsDto);
		BankEntity entity =  BankEntity.builder()
				.bankName(bankDetailsDto.getBankName())
				.bankAddress(bankDetailsDto.getBankAddress())
				.bankIFSC(bankDetailsDto.getBankIFSC())
				.bankCode(bankDetailsDto.getBankCode())
				.build();
		bankRepository.save(entity);
		
		log.info("createBank method Ended");
		return SUCCESFULLY_SAVED;
	}

}
