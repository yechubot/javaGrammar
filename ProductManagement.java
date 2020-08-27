package javaproject;

public class ProductManagement {
	String productNo;
	String productName;
	int amount;
	
	void productAdd(int item) {
		amount += item;
		
	}
	int productSubtract(int item) {
		if(amount<item) {
			return 0;
		} amount-= item;
			return item;
		
	}

}
