package com.ozu.model;

import java.io.FileNotFoundException;
import java.util.Date;

import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

public class ChangeOwner implements BankAccountUpdater {
	private String newOwner;
	private String oldOwner;
	

	public ChangeOwner(String newOwner) {
		super();
		this.newOwner = newOwner;
	}

	@Override
	public void update(BankAccount acc) throws FileNotFoundException, InsufficientBalanceException, SecurityException {
		oldOwner=acc.getOwnerName();
		acc.setOwnerName(newOwner);

	}

	@Override
	public Date getDate() {
		
		return new Date();
	}

}
