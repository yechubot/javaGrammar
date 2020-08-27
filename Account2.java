package javaproject;

public class Account2 {
	private int balance = 0;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int bal) {
		
		if(bal >= MIN_BALANCE && bal <= MAX_BALANCE) {
			this.balance = bal;
		}
	
	}
	
}
