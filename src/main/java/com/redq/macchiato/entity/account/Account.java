package com.redq.macchiato.entity.account;

import java.math.BigDecimal;

import javax.persistence.Entity;

import com.redq.macchiato.entity.BaseEntity;

@Entity
public class Account extends BaseEntity {
	
	private BigDecimal balance;

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
			
}
