


package javaproject;


public class Account {
	String accountNo; // account number field
	String ownerName; // name of the owner field
	int balance; // balance field
	
	
	
	//������ - class �̸��� ����
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo; // this -> field ( field, parameter �̸��� ���� �� �̷��� ǥ��)
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public Account() {
		
		}
	
	//��ȯ �� ����
	void deposit(int amount) {
		balance+=amount;
	}
	//��ȯ �� �־�� �� 
	int withdraw(int amount) throws Exception{
		if(balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
			
		}
		balance -=amount;
		return amount;
	}
}
