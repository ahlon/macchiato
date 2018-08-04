package com.redq.macchiato.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "u_user_favorite")
public class UserFavorite {
	
	private Long userId;
	
	private String objType;
	
	private Long objId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getObjType() {
		return objType;
	}

	public void setObjType(String objType) {
		this.objType = objType;
	}

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}
	
}
