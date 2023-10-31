package weeek4.examples;

public class BankAccount {
	private int accountNumber;
	private String ownerName;
	private double balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber,String ownerName) {
		this.accountNumber=accountNumber;
		this.ownerName=ownerName;
	}
	
	
	
	public boolean withdraw(double amount){
		balance=balance-amount;
		return true;
	}
	
	public boolean deposit(double amount){
		balance+=amount;
		return true;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void printAccountInfo() {
		System.out.println(ownerName+"'s "+ balance+" TL account");
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	private void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
