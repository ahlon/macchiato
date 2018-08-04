package com.redq.macchiato.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "u_user")
public class User extends BaseEntity {
	
	private String username;
	
	private String mobile;

	private String password;
	
	private UserStatus status;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	
}
