package com.ozu.model;

import java.util.Date;

import com.ozu.model.exception.InsufficientBalanceException;

public class ChangeOwner implements BankAccountUpdater {
	private String newOwner;
	private String oldOwner;
	

	public ChangeOwner(String newOwner) {
		super();
		this.newOwner = newOwner;
	}

	@Override
	public void update(BankAccount acc) throws  InsufficientBalanceException {
		oldOwner=acc.getOwnerName();
		acc.setOwnerName(newOwner);

	}

	@Override
	public Date getDate() {
		
		return new Date();
	}
	
	public String toString() {
		return "Owner name changed. Old owner is "+oldOwner+" new owner is "+newOwner;
	}

	@Override
	public boolean isTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

}
