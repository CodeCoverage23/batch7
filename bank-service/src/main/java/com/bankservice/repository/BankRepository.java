package com.bankservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankservice.entity.BankEntity;

@Repository
public interface BankRepository extends JpaRepository<BankEntity, Integer>{

}
