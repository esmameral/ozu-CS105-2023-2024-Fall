package com.ozu.model;

public class CheckTransaction extends WithdrawalTransaction {
	private String checkNumber;
	
	
	

	public CheckTransaction(double amount, String checkNumber) {
		super(amount);
		this.checkNumber = checkNumber;
	}

	

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}



	@Override
	public String toString() {
		 return super.toString()+" #" + checkNumber;
	}

}
