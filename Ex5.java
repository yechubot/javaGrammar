package javaproject;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	
	System.out.print("�ݾ��� �Է��ϼ���");
	Scanner sc = new Scanner(System.in);
	int money = sc.nextInt();
	
	int ten_thousands = money/10000;
	money %= 10000; // money = money%10000;
	
	int five_thousands = money/5000;
	money %= 5000; // money = money%5000;
	
	int thousands = money/1000;
	money %= 1000; 
	
	int five_hundreds = money/500;
	money %= 500;
	
	int hundreds = money/100;
	money %= 100;
	
	int tens = money/10;
	money %= 10;
	
	int ones = money%10;
	
	System.out.println("���� :" + ten_thousands +"��");
	System.out.println("��õ�� :" + five_thousands +"��");
	System.out.println("õ�� :" + thousands +"��");
	System.out.println("����� :" + five_hundreds +"��");
	System.out.println("��� :" + hundreds +"��");
	System.out.println("�ʿ� :" +tens +"��");
	System.out.println("�Ͽ� :" +ones +"��");
	
	}

}


