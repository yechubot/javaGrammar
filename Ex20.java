package javaproject;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		System.out.println("원하는 숫자는?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		while(i<100) {
			
			 i+= num; 
			 sum+= i; 
		}
		System.out.println("배수 합:"+sum);
	}

}

