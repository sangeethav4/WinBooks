package com.niit.WinBooksBackend.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="Orders")
@Component

public class Order {
	@Id
	
	private String orderId;
	private Double grandtotal;
	private String orderdate;
	private String ordertime;
	
	@OneToOne
	@JoinColumn(name="billing")
	private Billing billing;
	
	@OneToOne
	@JoinColumn(name="shipping")
	private Shipping shipping;
	
	@OneToOne
	@JoinColumn(name="pay")
	private Payment payment;
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;
	
	@OneToMany(mappedBy="order")
	 private List<OrderItems> orderItems;
	 
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(Double grandtotal) {
		this.grandtotal = grandtotal;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	
 
	
 

}
