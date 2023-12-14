package com.ozu.model;

import java.io.FileNotFoundException;
import java.util.Date;

import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

public interface BankAccountUpdater {
	public void update(BankAccount acc) throws FileNotFoundException, InsufficientBalanceException, SecurityException ;
	public Date getDate() ;

}
