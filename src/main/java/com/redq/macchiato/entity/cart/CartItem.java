package com.redq.macchiato.entity.cart;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "ca_cart_item")
public class CartItem extends BaseEntity {
	
	private Long userId;
	
	private Long productId;
	
	private Long skuId;
	
	private BigDecimal latestPrice;
	
	private CartItemStatus statut;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public BigDecimal getLatestPrice() {
		return latestPrice;
	}

	public void setLatestPrice(BigDecimal latestPrice) {
		this.latestPrice = latestPrice;
	}

	public CartItemStatus getStatut() {
		return statut;
	}

	public void setStatut(CartItemStatus statut) {
		this.statut = statut;
	}

}
