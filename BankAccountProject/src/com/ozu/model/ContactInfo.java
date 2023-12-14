package com.ozu.model;

public class ContactInfo {
	private String phoneNumber="";
	private String address="";

	public ContactInfo(String phoneNumber, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "phoneNumber=" + phoneNumber + ", address=" + address;
	}

}
