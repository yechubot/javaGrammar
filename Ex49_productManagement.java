package javaproject;

public class Ex49_productManagement {

	public static void main(String[] args) {
		ProductManagement bag = new ProductManagement();
		bag.productName = "����";
		bag.productNo = "1111";
		bag.amount = 23;
		
		ProductManagement phone = new ProductManagement();
		phone.productName = "�ڵ���";
		phone.productNo = "2222";
		phone.amount = 11;
		
		phone.productAdd(23);
		bag.productSubtract(10);
		printProducts(bag);
		printProducts(phone);
		
	}
	
	static void printProducts(ProductManagement obj) {
		System.out.println("��ǰ �̸�: "+obj.productName);
		System.out.println("��ǰ ��ȣ: "+obj.productNo);
		System.out.println("��ǰ ����: "+obj.amount);
	}
}


