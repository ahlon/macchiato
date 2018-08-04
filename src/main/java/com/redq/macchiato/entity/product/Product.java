package com.redq.macchiato.entity.product;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "pd_product")
public class Product extends BaseEntity {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
