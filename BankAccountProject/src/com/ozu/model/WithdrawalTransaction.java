package com.ozu.model;

public class WithdrawalTransaction extends Transaction {

	public WithdrawalTransaction(double amount) {
		super(amount);
	}

	@Override
	public void update(BankAccount acc) {
		acc.withdraw(getAmount());
	}

	
}
