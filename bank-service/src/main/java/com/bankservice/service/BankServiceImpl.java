package com.bankservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
		BankEntity entity = BankEntity.builder().bankName(bankDetailsDto.getBankName())
				.bankAddress(bankDetailsDto.getBankAddress()).bankIFSC(bankDetailsDto.getBankIFSC())
				.bankCode(bankDetailsDto.getBankCode()).build();
		bankRepository.save(entity);

		log.info("createBank method Ended");
		return SUCCESFULLY_SAVED;
	}

	@Override
	public List<BankEntity> getAllBanks() {
		log.info("getAllBanks method Started");

		List<BankEntity> entityList = bankRepository.findAll();
		log.info("List of Bank entity : {}", entityList);

		/*
		 * For Students reference
		 */
//		List<BankDetailsDto> bankDtoList = new ArrayList<BankDetailsDto>();
//
//		for (BankEntity entity : entityList) {
//
//			BankDetailsDto bankdto = new BankDetailsDto();
//			bankdto.setId(entity.getId());
//			bankdto.setBankIFSC(entity.getBankIFSC());
//			bankdto.setBankCode(entity.getBankCode());
//			bankdto.setBankName(entity.getBankName());
//			bankdto.setBankAddress(entity.getBankAddress());
//
//			bankDtoList.add(bankdto);
//		}

		log.info("getAllBanks method Ended");
		return entityList;
	}

	@Override
	public BankDetailsDto getBankById(int bankId) {
		log.info("getBankById method Started");

		BankEntity entity = bankRepository.findById(Integer.valueOf(bankId)).orElse(null);
		BankDetailsDto bankdto = new BankDetailsDto();

		if (entity == null) {
			return bankdto;
		}

		bankdto.setId(entity.getId());
		bankdto.setBankIFSC(entity.getBankIFSC());
		bankdto.setBankCode(entity.getBankCode());
		bankdto.setBankName(entity.getBankName());
		bankdto.setBankAddress(entity.getBankAddress());

		log.info("getBankById method Ended");

		return bankdto;
	}

}
