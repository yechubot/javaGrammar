package javaproject;

public class Ex48 {

	public static void main(String[] args) {
		int amount=0;
		Account younghee = new Account("222-333-4444", "�̿���", 10);
		Account chulsu = new Account(); // ����� ���ÿ� ��ü ���� ����
		chulsu.accountNo = "111-222-33333";
		chulsu.ownerName = "��ö��";
		chulsu.balance = 100;
		
		Account gildong = new Account();
		gildong.accountNo = "111-222-34343";
		gildong.ownerName = "��浿";
		gildong.balance = 0;
		
		chulsu.deposit(1000);
		chulsu.deposit(2000);
		gildong.deposit(30000);
		try {
			amount = gildong.withdraw(50000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("�浿 �����: "+ amount);
		printAccount(gildong);
		printAccount(chulsu);
		printAccount(younghee);
	}// main method done
	
	//���� ���  method
	static void printAccount(Account obj) {
		System.out.println("���¹�ȣ: "+obj.accountNo);
		System.out.println("������ �̸�: "+obj.ownerName);
		System.out.println("�ܾ�: "+obj.balance);
		System.out.println();
	}
	
}


