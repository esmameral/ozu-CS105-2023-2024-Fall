package com.ozu.model;

import java.io.FileNotFoundException;

import com.ozu.model.exception.InsufficientBalanceException;
import com.ozu.model.exception.SecurityException;

//public class BankAccount_old {
//	private static double usdRate = 0;
//	private static double interestRate = 0;
//
//	private int accountNumber;
//	private String ownerName;
//	private double balance;
//	private int depositCount;
//	private int withdrawCount;
//	private double maxDeposit;
//	private int negativeBalanceCount;
//	private int trxIndexNumber;
//	private Transaction[] transactions;
//	private BankAccountUpdater[] updates;
//	private ContactInfo contactInfo;
//
//	public BankAccount_old() {
//		transactions = new Transaction[4];
//		trxIndexNumber = 0;
//	}
//
//	public BankAccount_old(int accountNumber, String ownerName) {
//		this();
//		this.accountNumber = accountNumber;
//		this.ownerName = ownerName;
//	}
//
//	public double convertBalanceToUsd() {
//		return balance / BankAccount_old.usdRate;
//	}
//
//	public double calculateInterestAmount(int duration) {
//		return balance * duration * interestRate / 1200;
//	}
//
//	public String toString() {
//		return ownerName + "'s " + balance + " TL account " + contactInfo.toString();
//	}
//
//	public boolean withdraw(double amount) throws InsufficientBalanceException, SecurityException {
//
//		if (amount > 200000) {
//			throw new SecurityException("You cannot withdraw " + amount + "  for security reasons");
//
//		}
//		if (balance < amount) {
//			throw new InsufficientBalanceException("Insufficient Balance. You can only withdraw " + balance + " TL");
//		}
//
//		withdrawCount++;
//		double oldBalance = balance;
//		balance = balance - amount;
//		if (oldBalance > 0 && balance < 0) {
//			negativeBalanceCount++;
//		}
//		return true;
//	}
//
////	@Override
////	public String toString() {
////		return "BankAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance
////				+ "]";
////	}
//
//	public boolean deposit(double amount) {
//		// setDepositCount(getDepositCount()+1);
//		if (maxDeposit < amount)
//			maxDeposit = amount;
//		depositCount++;
//		balance += amount;
//		return true;
//	}
//
//	/*
//	 * PLEASE READ: Creating a new method for each type of Transactions is the worst
//	 * way. When you need to add a new Transaction type you have to update
//	 * BankAccount class and add a new post method
//	 * 
//	 */
////	public void post(WithdrawalTransaction withdrawalTransaction) {
////		withdraw(withdrawalTransaction.getAmount());
////		if(trxIndexNumber<=transactions.length-1) {
////			transactions[trxIndexNumber] = withdrawalTransaction;
////			trxIndexNumber++;
////		}else {
////			System.out.println("You cannot add new transactions!!!");
////		}
////	}
////
////	public void post(DepositTransaction depositTransaction) {
////		deposit(depositTransaction.getAmount());
////		if(trxIndexNumber<=transactions.length-1) {
////			transactions[trxIndexNumber] = depositTransaction;
////			trxIndexNumber++;
////		}else {
////			System.out.println("You cannot add new transactions!!!");
////		}
////	}
//
//	/*
//	 * Using polymorphism We will define only one method. updating balance must be
//	 * provided by Transaction itself
//	 * 
//	 */
//	public void post(BankAccountUpdater updater)
//			throws InsufficientBalanceException, SecurityException, FileNotFoundException {
//		updater.update(this);
//		if (trxIndexNumber <= transactions.length - 1) {
//			if (updater instanceof Transaction) {
//				transactions[trxIndexNumber] = (Transaction)updater;
//				trxIndexNumber++;
//			}
//		} else {
//			System.out.println("You cannot add new transactions!!!");
//		}
//	}
//
//	public void printTransactions() {
//		for (Transaction trx : transactions) {
//			if (trx != null)
//				System.out.println(trx);
//		}
//	}
//
//	public double getMaxDeposit() {
//		return maxDeposit;
//	}
//
//	private void setMaxDeposit(double maxDeposit) {
//		this.maxDeposit = maxDeposit;
//	}
//
//	public int getNegativeBalanceCount() {
//		return negativeBalanceCount;
//	}
//
//	private void setNegativeBalanceCount(int negativeBalanceCount) {
//		this.negativeBalanceCount = negativeBalanceCount;
//	}
//
//	public int getDepositCount() {
//		return depositCount;
//	}
//
//	private void setDepositCount(int depositCount) {
//		this.depositCount = depositCount;
//	}
//
//	public int getWithdrawCount() {
//		return withdrawCount;
//	}
//
//	private void setWithdrawCount(int withdrawCount) {
//		this.withdrawCount = withdrawCount;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void printAccountInfo() {
//		System.out.println(ownerName + "'s " + balance + " TL account");
//	}
//
//	public String getOwnerName() {
//		return ownerName;
//	}
//
//	public void setOwnerName(String ownerName) {
//		this.ownerName = ownerName;
//	}
//
//	public int getAccountNumber() {
//		return accountNumber;
//	}
//
//	private void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public static double getUsdRate() {
//		return usdRate;
//	}
//
//	public static void setUsdRate(double usdRate) {
//		BankAccount_old.usdRate = usdRate;
//	}
//
//	public static double getInterestRate() {
//		return interestRate;
//	}
//
//	public static void setInterestRate(double interestRate) {
//		BankAccount_old.interestRate = interestRate;
//	}
//
//	public Transaction[] getTransactions() {
//		return transactions;
//	}
//
//	public void setTransactions(Transaction[] transactions) {
//		this.transactions = transactions;
//	}
//
//	public ContactInfo getContactInfo() {
//		return contactInfo;
//	}
//
//	public void setContactInfo(ContactInfo contactInfo) {
//		this.contactInfo = contactInfo;
//	}
//
//}
