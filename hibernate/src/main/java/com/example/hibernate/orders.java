package com.example.hibernate;

import jakarta.persistence.Entity;

@Entity
public class orders {
	
	private int orderid;
	private String ordername;
	private String orderemail;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrderemail() {
		return orderemail;
	}
	public void setOrderemail(String orderemail) {
		this.orderemail = orderemail;
	}
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orders(int orderid, String ordername, String orderemail) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.orderemail = orderemail;
	}
	
}
