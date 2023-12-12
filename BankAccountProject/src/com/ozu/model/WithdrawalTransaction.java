package com.ozu.model;

import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

public class WithdrawalTransaction extends Transaction {

	public WithdrawalTransaction(double amount) {
		super(amount);
	}

	@Override
	public void update(BankAccount acc) throws InsufficientBalanceException, SecurityException {
		
			acc.withdraw(getAmount());
		
	}

	

	
}
