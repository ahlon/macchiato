package com.redq.macchiato.entity.order;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "o_order_package")
public class OrderPackageItem extends BaseEntity {
	
	private Long orderPackageId;
	
	private Long orderItemId;
	
	private Integer orderItemAmount;

	public Long getOrderPackageId() {
		return orderPackageId;
	}

	public void setOrderPackageId(Long orderPackageId) {
		this.orderPackageId = orderPackageId;
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Integer getOrderItemAmount() {
		return orderItemAmount;
	}

	public void setOrderItemAmount(Integer orderItemAmount) {
		this.orderItemAmount = orderItemAmount;
	}
	
}
