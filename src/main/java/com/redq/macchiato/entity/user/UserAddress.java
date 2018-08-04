package com.redq.macchiato.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "ur")
public class UserAddress extends BaseEntity {
	
	private Long userId;
	
	private String recipient;
	
	private String phone;
	
	private Long zoneId;
	
	private Long street;
	
	private boolean primary;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getZoneId() {
		return zoneId;
	}

	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
	}

	public Long getStreet() {
		return street;
	}

	public void setStreet(Long street) {
		this.street = street;
	}

	public boolean isPrimary() {
		return primary;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}
	
}
