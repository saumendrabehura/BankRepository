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
@Table(name = "SavingsAccount")
public class SavingsAccount {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
    private Long id;
	@Column(name = "AccountNumber")
    private int accountNumber;
	@Column(name = "AccountBalance")
    private BigDecimal accountBalance;
	
	@OneToMany(mappedBy = "SavingsAccount",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<SavingTranscation> savingTranscationList;

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

	public List<SavingTranscation> getSavingTranscationList() {
		return savingTranscationList;
	}

	public void setSavingTranscationList(List<SavingTranscation> savingTranscationList) {
		this.savingTranscationList = savingTranscationList;
	}

	@Override
	public String toString() {
		return "SavingsAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", savingTranscationList=" + savingTranscationList + "]";
	}
	
	
	
}
