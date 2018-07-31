package com.redq.sandbox.demo.entity;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	
	private Date createdAt;
	private Date udpatedAt;
	private boolean deleted = false;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUdpatedAt() {
		return udpatedAt;
	}

	public void setUdpatedAt(Date udpatedAt) {
		this.udpatedAt = udpatedAt;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
