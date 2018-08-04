package com.redq.macchiato.entity.order;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
	
	private String orderNo;

	private Long userId;
	
	private BigDecimal productPrice;
	
	private BigDecimal logisticPrice;
	
	private BigDecimal reductionPrice;

	private BigDecimal totalPrice;
	
	private OrderStatus status;
	
	private boolean paid;
	
	private Date paidTime;
	
	private Date shippedTime;
	
	private OrderSource source;

	private String remark;
}
