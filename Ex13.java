package javaproject;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		System.out.println("원하는 단은?");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" +dan*i);
		
		
		
		/*
		int dan = 2;
		System.out.println("** 2단 **");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" +dan*i);
			*/
		}
	}

}