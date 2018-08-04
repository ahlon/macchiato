package com.redq.macchiato.entity.order;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;
import com.redq.macchiato.entity.account.PayChannel;

@Entity
@Table(name = "o_order_payment_item")
public class OrderPaymentItem extends BaseEntity {
	
	private Long orderId;
	
	private Long orderPaymentId;
	
	private PayChannel channel;
	
	private BigDecimal amount;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderPaymentId() {
		return orderPaymentId;
	}

	public void setOrderPaymentId(Long orderPaymentId) {
		this.orderPaymentId = orderPaymentId;
	}

	public PayChannel getChannel() {
		return channel;
	}

	public void setChannel(PayChannel channel) {
		this.channel = channel;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
