package javaproject;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		System.out.println("lucky?");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
		int ComNum = (int)(Math.random()*6)+1;
		if(myNum == ComNum) {
			System.out.println("lucky!");
		}else {
			System.out.println("wrong!");
		}
	}

}
