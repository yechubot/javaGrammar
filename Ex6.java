package javaproject;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("구매 수량은?");
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		
		System.out.println("구매 단가는?");	
		int price = sc.nextInt();
	
		String memo = "(무료배송)";
		int sales = items*price;
		
		if(sales <30000) {
			sales +=2500; // sales = sales +2500;
			memo = "(배송료표함)";
		}
		System.out.println("결제 금액: " + sales + memo);
	}

}
