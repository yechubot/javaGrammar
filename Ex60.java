package javaproject;

public class Ex60 {

	public static void main(String[] args) {
		Account obj;
		obj = new DokdoPointAccount("111-222-55555", "ȫ�浿", 0,0);
		
		try {
			obj.deposit(30000);
			System.out.println("�ܾ�: "+obj.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
}

