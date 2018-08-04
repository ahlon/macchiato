package com.redq.macchiato.entity.product;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "pd_inventory_history")
public class InventoryHistory extends BaseEntity {
	
	private Long prodId;
	
	private Long skuId;
	
	private InventoryChangeType type;
	
	private Integer amount;

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public InventoryChangeType getType() {
		return type;
	}

	public void setType(InventoryChangeType type) {
		this.type = type;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
