package com.redq.macchiato.entity.account;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "fi_accout")
public class Account extends BaseEntity {
	
	private Long userId;
	
	private BigDecimal balance;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
}
