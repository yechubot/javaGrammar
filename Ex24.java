package javaproject;

import java.util.Scanner;

public class Ex24 {
	
	public static void main(String[] args) {
		System.out.println("���� �Է�");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int i;
		 for(i=2; i<=num-1; i++) {
			 if(num%i==0) {
				 break;
			 }
		 }
		 if(num==i) {
			 System.out.println("�Ҽ�!");
		 }else {
			 System.out.println("�Ҽ� �ƴ�!");
		 }
		
	}
}