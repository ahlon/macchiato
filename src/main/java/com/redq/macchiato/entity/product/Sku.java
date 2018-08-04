package com.redq.macchiato.entity.product;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pd_sku")
public class Sku {
	
	private Long productId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
}
