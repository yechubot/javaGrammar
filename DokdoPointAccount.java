package javaproject;

public class DokdoPointAccount extends Account{
	int dokdoPoint; // ���� ��� ��� ���� ����Ʈ
	
	public DokdoPointAccount(String accountNo, String ownerName, int balance, int dokdoPoint) {
		super(accountNo, ownerName, balance);
		this.dokdoPoint = dokdoPoint;
	}
	@Override 
	void deposit(int amount) {
		super.deposit(amount);
		dokdoPoint += (int)(amount*0.001);
	}
}
