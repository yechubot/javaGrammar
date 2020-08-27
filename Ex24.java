package javaproject;

import java.util.Scanner;

public class Ex24 {
	
	public static void main(String[] args) {
		System.out.println("숫자 입력");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int i;
		 for(i=2; i<=num-1; i++) {
			 if(num%i==0) {
				 break;
			 }
		 }
		 if(num==i) {
			 System.out.println("소수!");
		 }else {
			 System.out.println("소수 아님!");
		 }
		
	}
}