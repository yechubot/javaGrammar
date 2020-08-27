package javaproject;

public class Ex49_productManagement {

	public static void main(String[] args) {
		ProductManagement bag = new ProductManagement();
		bag.productName = "가방";
		bag.productNo = "1111";
		bag.amount = 23;
		
		ProductManagement phone = new ProductManagement();
		phone.productName = "핸드폰";
		phone.productNo = "2222";
		phone.amount = 11;
		
		phone.productAdd(23);
		bag.productSubtract(10);
		printProducts(bag);
		printProducts(phone);
		
	}
	
	static void printProducts(ProductManagement obj) {
		System.out.println("제품 이름: "+obj.productName);
		System.out.println("제품 번호: "+obj.productNo);
		System.out.println("제품 갯수: "+obj.amount);
	}
}


