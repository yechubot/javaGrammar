package javaproject;
//���̳ʽ� ���� Ŭ����
public class CreditLineAccount extends Account {
	//���̳ʽ� �ѵ� �ʵ�
	int creditLine;
	
	//������
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo,ownerName, balance); // Account �� �̹� �ִ� �� -> super �� ����
		this.creditLine = creditLine;
	}
	
	//�θ� �ִ� method �ƴ�, ������ �� - overriding
	@Override // ���� method override�� ���
	int withdraw(int amount) throws Exception {
		if((balance+creditLine) < amount) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		balance-= amount; 
		return amount;
	}
}
