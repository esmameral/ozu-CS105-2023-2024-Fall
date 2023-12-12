package com.ozu.model;

import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

public class EftTransaction extends WithdrawalTransaction{
	private String receiverIban;
	private double fee = 10;

	public EftTransaction(String receiverIban, double amount) {
		super(amount);
		this.receiverIban = receiverIban;

	}

	
	/**
	 * @return the receiverIban
	 */
	public String getReceiverIban() {
		return receiverIban;
	}

	/**
	 * @param receiverIban the receiverIban to set
	 */
	public void setReceiverIban(String receiverIban) {
		this.receiverIban = receiverIban;
	}

	
	public double getFee() {
		return fee;
	}

	
	public void setFee(double fee) {
		this.fee = fee;
	}


	@Override
	public void update(BankAccount acc) throws InsufficientBalanceException, SecurityException {
		
			acc.withdraw(getAmount()+fee);
		
	}

}
