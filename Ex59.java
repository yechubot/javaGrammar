package javaproject;

public class Ex59 {

	public static void main(String[] args) {
		DokdoPointAccount youngHee = new DokdoPointAccount("111-222-010101", "�̿���", 0, 0);
		
		youngHee.deposit(500000);
		System.out.println("�ܾ�:"+youngHee.balance);
		System.out.println("���������� ��������Ʈ:"+youngHee.dokdoPoint);
		
		youngHee.deposit(100000);
		System.out.println("�ܾ�:"+youngHee.balance);
		System.out.println("���������� ��������Ʈ:"+youngHee.dokdoPoint);
		
	}
	
}

