package javaproject;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("���� ������?");
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		
		System.out.println("���� �ܰ���?");	
		int price = sc.nextInt();
	
		String memo = "(������)";
		int sales = items*price;
		
		if(sales <30000) {
			sales +=2500; // sales = sales +2500;
			memo = "(��۷�ǥ��)";
		}
		System.out.println("���� �ݾ�: " + sales + memo);
	}

}
