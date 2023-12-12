package com.ozu.model.test;

import com.ozu.model.BankAccount;
import com.ozu.model.CheckTransaction;
import com.ozu.model.DepositTransaction;
import com.ozu.model.EftTransaction;
import com.ozu.model.Transaction;
import com.ozu.model.WithdrawalTransaction;
import com.ozu.model.exception.InsufficientBalanceException;

public class TestBankAccount {

	public static void main(String[] args) {
		try {
			BankAccount account = new BankAccount(12345, "Jim");
			// EftTransaction eftTrx = new EftTransaction("TR1910918",100);

			DepositTransaction depTrx1 = new DepositTransaction(100);
//		DepositTransaction depTrx2 = new DepositTransaction(2000);
//		DepositTransaction depTrx3 = new DepositTransaction(500);
			WithdrawalTransaction witTrx = new WithdrawalTransaction(2000000);
//		CheckTransaction chTrx = new CheckTransaction(300, "23X5");

			account.post(depTrx1);
//		account.post(eftTrx);
//		account.post(depTrx2);
//		account.post(depTrx3);
			account.post(witTrx);
//		account.post(chTrx);
			System.out.println(account.getBalance());

//		System.out.println("TRANSACTION LIST");
//		account.printTransactions();
		} catch (InsufficientBalanceException e) {
			System.out.println("InsufficientBalanceException");
		} catch (com.ozu.model.exception.SecurityException e) {
			System.out.println("SecurityException");
			// alerts...
		}

	}

}
