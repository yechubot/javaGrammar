package javaproject;

import java.util.Scanner;

public class Ex21 {
	
	public static void main(String[] args) {
		System.out.println("lucky number?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int per = 100;
		while(true) {
			int com = (int)(Math.random()*6)+1;
			if(com==num) {
				break;
			}
			per/=2; // per = per/2;
	}
	
		System.out.println("오늘의 행운지수 = "+per+"%");
}

}