package com.bank.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "primryAccount")
public class PrimaryAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long id;
	@Column(name = "AccountNumber")
	private int accountNumber;
	@Column(name = "AccountBalance")
	private BigDecimal accountBalance;
	
	@OneToMany(mappedBy = "PrimaryAccount",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<PrimaryTransction> primaryTranscationList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<PrimaryTransction> getPrimaryTranscationList() {
		return primaryTranscationList;
	}

	public void setPrimaryTranscationList(List<PrimaryTransction> primaryTranscationList) {
		this.primaryTranscationList = primaryTranscationList;
	}

	@Override
	public String toString() {
		return "PrimryAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", primaryTranscationList=" + primaryTranscationList + "]";
	}
	
	
	
	}
	
	
	
	


