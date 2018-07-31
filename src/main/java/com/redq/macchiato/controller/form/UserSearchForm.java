package com.redq.macchiato.controller.form;

import java.util.Date;

public class UserSearchForm {
	
	private String username;
	
	private Date createdAtFrom;
	
	private Date createdAtTo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatedAtFrom() {
		return createdAtFrom;
	}

	public void setCreatedAtFrom(Date createdAtFrom) {
		this.createdAtFrom = createdAtFrom;
	}

	public Date getCreatedAtTo() {
		return createdAtTo;
	}

	public void setCreatedAtTo(Date createdAtTo) {
		this.createdAtTo = createdAtTo;
	}
	
}
