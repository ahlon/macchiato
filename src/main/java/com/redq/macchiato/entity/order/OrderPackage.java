package com.redq.macchiato.entity.order;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "o_order_package")
public class OrderPackage extends BaseEntity {
	
	private Long orderId;
	
	private String LogisticCompany;
	
	private String LogisticNo;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getLogisticCompany() {
		return LogisticCompany;
	}

	public void setLogisticCompany(String logisticCompany) {
		LogisticCompany = logisticCompany;
	}

	public String getLogisticNo() {
		return LogisticNo;
	}

	public void setLogisticNo(String logisticNo) {
		LogisticNo = logisticNo;
	}
	
}
