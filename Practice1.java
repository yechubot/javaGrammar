package javaproject;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		String str [] = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘은 무슨 요일>");
		String day = sc.next();
		
		if(day.equals(str[6])|| day.equals(str[5])) {
			System.out.println("주말!");
		}else {
			System.out.println("평일!");
		}
	}
		
}
		
	

