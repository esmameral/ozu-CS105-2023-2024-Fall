package weeek5.examples.test;

import weeek5.examples.BankAccount;

public class TestBankAccountCountFields {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(12,"Mete");	
		System.out.println(acc);	//Mete's 100.0 TL account
		acc.deposit(100);//100
		acc.deposit(300);//400
		System.out.println(acc);
		acc.withdraw(50);//350
		System.out.println(acc);
		acc.withdraw(500);//-150 //nega=1
		acc.withdraw(300);//-450
		acc.deposit(400);//-50
		acc.withdraw(200);//-250
		acc.deposit(400);//150
		acc.withdraw(200);//-50 //nage=2
		
		System.out.println(acc);
		System.out.println("Deposit Count:"+acc.getDepositCount());
		System.out.println("Withdraw Count:"+acc.getWithdrawCount());
		System.out.println("MaxDeposit:"+acc.getMaxDeposit());
		System.out.println("NegativeBalanceCount:"+acc.getNegativeBalanceCount());




	}

}
