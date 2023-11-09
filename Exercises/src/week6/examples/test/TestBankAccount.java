package week6.examples.test;

import week6.examples.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		
		
		
		BankAccount.setUsdRate(28.96);
		System.out.println(BankAccount.getUsdRate());
		BankAccount acc1=new BankAccount(123,"Merve");
		BankAccount acc2=new BankAccount(345,"Kerem");
		
		
		acc1.equals(acc2);
		acc1.equals(null);
		
		System.out.println(BankAccount.getUsdRate());
		acc1.deposit(2000);
		acc2.deposit(2000);
		
		System.out.println(acc1.convertBalanceToUsd());
		System.out.println(acc2.convertBalanceToUsd());
		//acc1.setUsdRate(30);
		BankAccount.setUsdRate(30);
		System.out.println(acc1.convertBalanceToUsd());
		System.out.println(acc2.convertBalanceToUsd());
		
		BankAccount.setInterestRate(12.5);
		System.out.println("Interest Amount:"+acc1.calculateInterestAmount(3));
	}

}
