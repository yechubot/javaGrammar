package javaproject;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	
	System.out.print("금액을 입력하세요");
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
	
	System.out.println("만원 :" + ten_thousands +"장");
	System.out.println("오천원 :" + five_thousands +"장");
	System.out.println("천원 :" + thousands +"장");
	System.out.println("오백원 :" + five_hundreds +"장");
	System.out.println("백원 :" + hundreds +"장");
	System.out.println("십원 :" +tens +"장");
	System.out.println("일원 :" +ones +"장");
	
	}

}


