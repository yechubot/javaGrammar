package javaproject;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		System.out.print("���Լ���?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("�ǸŴܰ�?");
		int price = sc.nextInt();
		int result;
		String memo;
		if(num >= 10 && price >=1000) {
			result = (int) (num*price*0.8);
			memo = "(���ΰ�)";
		} else {
			result = price*num;
			memo = "(����)";					
		}
		
		System.out.println(" �� �ǸŰ�= "+ result +memo);
		
 }
	
}


