package com.bankservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bankDetails")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String bankName;
	@Column
	private String bankAddress;
	@Column
	private String bankIFSC;
	@Column
	private String bankCode;

}
