package javaproject;

public class Ex58 {

	public static void main(String[] args) {
		CreditLineAccount gildong = new CreditLineAccount("222-111-23232", "ȫ�浿", 10000, 2000000);
		gildong.deposit(50000);
		
		try {
			int amount = gildong.withdraw(1000000);
			System.out.println("�����: "+amount);
			System.out.println("�ܾ�: "+gildong.balance);
			System.out.println("���̳ʽ� �ѵ�:"+gildong.creditLine);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}

	
}

