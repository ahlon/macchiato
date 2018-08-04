package com.redq.macchiato.entity.order;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "o_order_payment")
public class OrderPayment extends BaseEntity {
	
	private Long orderId;
	
	private BigDecimal paidPrice;
	
	private Date paidTime;
	
	private Long paidUserId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getPaidPrice() {
		return paidPrice;
	}

	public void setPaidPrice(BigDecimal paidPrice) {
		this.paidPrice = paidPrice;
	}

	public Date getPaidTime() {
		return paidTime;
	}

	public void setPaidTime(Date paidTime) {
		this.paidTime = paidTime;
	}

	public Long getPaidUserId() {
		return paidUserId;
	}

	public void setPaidUserId(Long paidUserId) {
		this.paidUserId = paidUserId;
	}
	
}
