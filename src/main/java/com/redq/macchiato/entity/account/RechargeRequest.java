package com.redq.macchiato.entity.account;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "fi_recharge_reqeust")
public class RechargeRequest extends BaseEntity {
	
	private Long userId;
	
	private Long accountId;
	
	private String serialNo;

	private BigDecimal amount;
	
	private PayChannel channel;
	
	private String outTradeNo;
	
	private Long auditedBy;
	
	private String auditRemark;
	
	private Date auditedAt;
	
	private RechargeStatus status;

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

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public PayChannel getChannel() {
		return channel;
	}

	public void setChannel(PayChannel channel) {
		this.channel = channel;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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

	public RechargeStatus getStatus() {
		return status;
	}

	public void setStatus(RechargeStatus status) {
		this.status = status;
	}
	
}
