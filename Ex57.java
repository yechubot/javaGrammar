package javaproject;

public class Ex57 {

	public static void main(String[] args) {
		
		CheckingAccount chulsu = new CheckingAccount("111-222-12334", "��ö��", 0, "1111-2222-3333-4444");
		chulsu.deposit(100000);
		try {
			int paidAmount = chulsu.pay("1111-2222-3333-4444", 300000);
			System.out.println("���Ҿ�:"+paidAmount);
			System.out.println("�ܾ�:"+chulsu.balance);
			//ī���ȣ Ʋ����  catch�� �Ѿ 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

	
}

