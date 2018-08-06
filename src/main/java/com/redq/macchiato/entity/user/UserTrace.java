package com.redq.macchiato.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "u_user_trace")
public class UserTrace extends BaseEntity {

    //客户端请求ip
    private String clientIp;
    //客户端请求路径
    private String uri;
    //终端请求方式,普通请求,ajax请求
    private String type;
    //请求方式method,post,get等
    private String method;
    // 请求参数
    private String params;
    //请求接口唯一session标识
    private String sessionId;
    //请求时间
    private Date requestTime;
    //接口返回时间
    private Date returnTime;
    //请求耗时秒单位
    private int consumingTime;
    //接口返回数据json
    private String returnData;
    //请求时httpStatusCode代码，如：200,400,404等
    private String httpStatusCode;
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Date getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}
	public Date getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	public int getConsumingTime() {
		return consumingTime;
	}
	public void setConsumingTime(int consumingTime) {
		this.consumingTime = consumingTime;
	}
	public String getReturnData() {
		return returnData;
	}
	public void setReturnData(String returnData) {
		this.returnData = returnData;
	}
	public String getHttpStatusCode() {
		return httpStatusCode;
	}
	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	
}
