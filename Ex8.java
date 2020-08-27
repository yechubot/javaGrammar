package javaproject;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		System.out.println("여행지 선택(1.미주 2.유럽 3.동남아)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("1층 안내데스크로 가세요");
			break;
		case 2:
			System.out.println("2층 안내데스크로 가세요");
			break;
			
		case 3:
			System.out.println("3층 안내데스크로 가세요");
			break;
			
		default:
			System.out.println("선택 틀림!");
	
		}
		}

}
