package weeek4.examples.test;

import weeek4.examples.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount acc=new BankAccount(123,"Merve");
		System.out.println(acc.getBalance());
		acc.printAccountInfo();
		acc.setOwnerName("Hasan");
		acc.deposit(200);
		System.out.println(acc.getBalance());
		acc.printAccountInfo();
		
		
		acc.withdraw(50);
		
		
		acc.printAccountInfo();

	}

}
