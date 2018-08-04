package com.redq.macchiato.entity.order;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "o_order")
public class Order extends BaseEntity {
	
	private String orderNo;

	private Long userId;
	
	private BigDecimal productPrice;
	
	private BigDecimal logisticPrice;
	
	private BigDecimal reductionPrice;

	private BigDecimal totalPrice;
	
	private OrderStatus status;
	
	private boolean paid;
	
	private Date paidTime;
	
	private Date shippedTime;
	
	private OrderSource source;

	private String remark;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public BigDecimal getLogisticPrice() {
		return logisticPrice;
	}

	public void setLogisticPrice(BigDecimal logisticPrice) {
		this.logisticPrice = logisticPrice;
	}

	public BigDecimal getReductionPrice() {
		return reductionPrice;
	}

	public void setReductionPrice(BigDecimal reductionPrice) {
		this.reductionPrice = reductionPrice;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Date getPaidTime() {
		return paidTime;
	}

	public void setPaidTime(Date paidTime) {
		this.paidTime = paidTime;
	}

	public Date getShippedTime() {
		return shippedTime;
	}

	public void setShippedTime(Date shippedTime) {
		this.shippedTime = shippedTime;
	}

	public OrderSource getSource() {
		return source;
	}

	public void setSource(OrderSource source) {
		this.source = source;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
