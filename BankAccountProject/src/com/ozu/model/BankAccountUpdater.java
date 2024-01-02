package com.ozu.model;

import java.util.Date;

import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

public interface BankAccountUpdater {
	public void update(BankAccount acc) throws SecurityException, InsufficientBalanceException  ;
	public Date getDate() ;
	public boolean isTransaction();

}
