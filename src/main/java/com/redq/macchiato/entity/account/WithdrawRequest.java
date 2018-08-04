package com.redq.macchiato.entity.account;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "fi_withdraw_reqeust")
public class WithdrawRequest extends BaseEntity {
	
	private Long userId;
	
	private Long accountId;
	
	private BigDecimal amount;
	
	private BigDecimal commission;  // 手续费
	
	private String bankName;
	
	private String cardNo;
	
	private String holder;
	
	private String reqRemark;
	
	private Long auditedBy;
	
	private String auditRemark;
	
	private Date auditedAt;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getReqRemark() {
		return reqRemark;
	}

	public void setReqRemark(String reqRemark) {
		this.reqRemark = reqRemark;
	}

	public Long getAuditedBy() {
		return auditedBy;
	}

	public void setAuditedBy(Long auditedBy) {
		this.auditedBy = auditedBy;
	}

	public String getAuditRemark() {
		return auditRemark;
	}

	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

	public Date getAuditedAt() {
		return auditedAt;
	}

	public void setAuditedAt(Date auditedAt) {
		this.auditedAt = auditedAt;
	}
	
}
