package com.ozu.model;

import java.util.Date;

public class ChangeContactInfo implements BankAccountUpdater{
	private String newAddress;
	private String newPhoneNumber;
	private String oldAddress;
	private String oldPhoneNumber;
	private Date createDate;

	public ChangeContactInfo(String newAddress, String newPhoneNumber) {
		super();
		this.newAddress = newAddress;
		this.newPhoneNumber = newPhoneNumber;
		this.createDate=new Date();
	}

	
	
	public String getNewAddress() {
		return newAddress;
	}

	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}

	public String getNewPhoneNumber() {
		return newPhoneNumber;
	}

	public void setNewPhoneNumber(String newPhoneNumber) {
		this.newPhoneNumber = newPhoneNumber;
	}

	public String getOldAddress() {
		return oldAddress;
	}

	public void setOldAddress(String oldAddress) {
		this.oldAddress = oldAddress;
	}

	public String getOldPhoneNumber() {
		return oldPhoneNumber;
	}

	public void setOldPhoneNumber(String oldPhoneNumber) {
		this.oldPhoneNumber = oldPhoneNumber;
	}

	@Override
	public void update(BankAccount acc) {
		oldAddress=acc.getContactInfo().getAddress();
		oldPhoneNumber=acc.getContactInfo().getPhoneNumber();
		
		acc.getContactInfo().setPhoneNumber(newPhoneNumber);
		acc.getContactInfo().setAddress(newAddress);
	}

	@Override
	public Date getDate() {
		return createDate;
		
	}

}
