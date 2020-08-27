package javaproject;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		System.out.print("구입수량?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("판매단가?");
		int price = sc.nextInt();
		int result;
		String memo;
		if(num >= 10 && price >=1000) {
			result = (int) (num*price*0.8);
			memo = "(할인가)";
		} else {
			result = price*num;
			memo = "(정상가)";					
		}
		
		System.out.println(" 총 판매가= "+ result +memo);
		
 }
	
}


