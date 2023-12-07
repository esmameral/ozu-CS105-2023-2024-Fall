package com.ozu.model;

public class SalaryPayment extends DepositTransaction{
	private String company;
	private int year;
	private int month;

	public SalaryPayment(String company, int year, int month,double amount) {
		super(amount);
		this.company = company;
		this.year = year;
		this.month = month;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	
}
