package javaproject;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		System.out.println("�󸶱��� ���ұ��?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		int sum = 0;
		for(int i =1; i<=num; i++) {
			sum+= i; //sum = sum+i;
		}
		System.out.println("1���� " + num + "������ �� :" +sum);
	}

}
