package com.ozu.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

public abstract class Transaction implements BankAccountUpdater{
	private double amount;
	private Date date;
	
	public abstract void update(BankAccount acc) throws InsufficientBalanceException, SecurityException ;
	
	
	public Transaction() {
		super();
	}
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
	public String formatDate() {
		String pattern="dd.MM.yyyy HH:mm:ss"; 
		SimpleDateFormat format=new SimpleDateFormat(pattern);
		return format.format(date);
	}
	@Override
	public String toString() {
		return "A $"+amount +" "+this.getClass().getSimpleName()+" Tr Date:"+formatDate();
	}
	
	
	

}
