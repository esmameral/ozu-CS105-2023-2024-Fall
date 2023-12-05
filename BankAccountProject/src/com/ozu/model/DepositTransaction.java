package com.ozu.model;

public class DepositTransaction extends Transaction {

	public DepositTransaction() {
		super();
	}

	public DepositTransaction(double amount) {
		super(amount);
		
	}

	@Override
	public void update(BankAccount acc) {
		acc.deposit(getAmount());
	}
	
	

}
