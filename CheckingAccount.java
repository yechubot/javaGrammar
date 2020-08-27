package javaproject;

public class CheckingAccount extends Account{
	String cardNo; // ī��
	
	// ������
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	//ī��� �����ϴ� method
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)) {
			throw new Exception("ī���ȣ�� ��ġ���� �ʾ� ������ �Ұ����մϴ�.");
		}else {
			return withdraw(amount);
		}
	}
}
