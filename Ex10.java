package javaproject;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		System.out.println("얼마까지 더할까요?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		int sum = 0;
		for(int i =1; i<=num; i++) {
			sum+= i; //sum = sum+i;
		}
		System.out.println("1부터 " + num + "까지의 합 :" +sum);
	}

}
