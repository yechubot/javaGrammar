


package javaproject;


public class Account {
	String accountNo; // account number field
	String ownerName; // name of the owner field
	int balance; // balance field
	
	
	
	//생성자 - class 이름과 동일
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo; // this -> field ( field, parameter 이름이 같을 때 이렇게 표현)
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public Account() {
		
		}
	
	//반환 값 없음
	void deposit(int amount) {
		balance+=amount;
	}
	//반환 값 있어야 됨 
	int withdraw(int amount) throws Exception{
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
			
		}
		balance -=amount;
		return amount;
	}
}
