package com.redq.sandbox.demo.entity.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.redq.sandbox.demo.entity.BaseEntity;

@Entity
public class Account extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
