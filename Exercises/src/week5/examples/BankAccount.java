package week5.examples;

public class BankAccount {
	private int accountNumber;
	private String ownerName;
	private double balance;
	private int depositCount;
	private int withdrawCount;
	private double maxDeposit;
	private int negativeBalanceCount;

	public BankAccount() {

	}

	public BankAccount(int accountNumber, String ownerName) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
	}

	public String toString() {
		return ownerName + "'s " + balance + " TL account";
	}

	public boolean withdraw(double amount) {
		withdrawCount++;
		double oldBalance=balance;
		balance = balance - amount;
		if(oldBalance>0&&balance<0) {
			negativeBalanceCount++;
		}
		return true;
	}

//	@Override
//	public String toString() {
//		return "BankAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance
//				+ "]";
//	}

	public boolean deposit(double amount) {
		//setDepositCount(getDepositCount()+1);
		if(maxDeposit<amount)
			maxDeposit=amount;
		depositCount++;
		balance += amount;
		return true;
	}
	public double getMaxDeposit() {
		return maxDeposit;
	}

	private void setMaxDeposit(double maxDeposit) {
		this.maxDeposit = maxDeposit;
	}

	public int getNegativeBalanceCount() {
		return negativeBalanceCount;
	}

	private void setNegativeBalanceCount(int negativeBalanceCount) {
		this.negativeBalanceCount = negativeBalanceCount;
	}
	
	public int getDepositCount() {
		return depositCount;
	}

	private void setDepositCount(int depositCount) {
		this.depositCount = depositCount;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}

	private void setWithdrawCount(int withdrawCount) {
		this.withdrawCount = withdrawCount;
	}

	public double getBalance() {
		return balance;
	}

	public void printAccountInfo() {
		System.out.println(ownerName + "'s " + balance + " TL account");
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
