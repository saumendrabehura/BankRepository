package com.bank.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "PrimaryTranscation")
public class PrimaryTransction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long id;
	@Column(name = "Date")
    private Date date;
	@Column(name = "Description")
    private String description;
	@Column(name = "Type")
    private String type;
	@Column(name = "Status")
    private String status;
	@Column(name = "Amount")
    private double amount;
	@Column(name = "AvailableBalance")
    private BigDecimal availableBalance;
	
	@ManyToOne
	@JoinColumn(name = "primary_account_id")
	private PrimaryAccount primaryAccount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}

	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	@Override
	public String toString() {
		return "PrimaryTransction [id=" + id + ", date=" + date + ", description=" + description + ", type=" + type
				+ ", status=" + status + ", amount=" + amount + ", availableBalance=" + availableBalance
				+ ", primaryAccount=" + primaryAccount + "]";
	}



}


