package javaproject;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		System.out.print("수항성적?");
		Scanner sc = new Scanner(System.in);
		int mathScore = sc.nextInt();
		System.out.print("영어성적?");
		int englishScore = sc.nextInt();
		
		if( mathScore >= 80 || englishScore >= 80) {
			System.out.println("경시대회 참여가능합니다!");
		} else {
			System.out.println("다음 대회를 기다리세요");
		}
		
 }
	
}


