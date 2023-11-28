package com.ozu.model;

import java.util.Date;

public class Transaction {
	private double amount;
	private Date date;
	public Transaction(double amount) {
		super();
		this.amount = amount;
		this.date=new Date();
	}
	public double getAmount() {
		return amount;
	}
	private void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	private void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
