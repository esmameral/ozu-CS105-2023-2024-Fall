package com.ozu.model.test;

import com.ozu.model.BankAccount;
import com.ozu.model.ChangeContactInfo;
import com.ozu.model.ChangeOwner;
import com.ozu.model.ContactInfo;
import com.ozu.model.DepositTransaction;
import com.ozu.model.Transaction;
import com.ozu.model.WithdrawalTransaction;
import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

public class TestBankAccountUpdates {

	public static void main(String[] args) throws Exception {
		BankAccount account = new BankAccount(878, "Taner");
		ContactInfo info = new ContactInfo("05657778899", "Cekmekoy");
		account.setContactInfo(info);

		DepositTransaction depTrx1 = new DepositTransaction(100);
		DepositTransaction depTrx2 = new DepositTransaction(200);
		Transaction withTrx = new WithdrawalTransaction(50);
		account.post(depTrx1);
		account.post(depTrx2);
		account.post(withTrx);
		System.out.println(account);
		ChangeContactInfo updateAccInfo = new ChangeContactInfo("Maltepe","06667778899");
		
		account.post(updateAccInfo);
		System.out.println(account);
		ChangeOwner co=new ChangeOwner("Alperen");
		account.post(co);
		
		
		System.out.println(account);
		
		System.out.println("*** TRANSACTIONS ***");
		
		account.printTransactions();
		System.out.println("*** ALL BANK ACCOUNT UPDATES ***");
		account.printAllUpdates();

	}

}
