package javaproject;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		System.out.println("나의 선택은?(1.가위 2.바위 3.보)");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
		
		int comNum = (int)(Math.random()*3+1);
		String dice[] = {"가위", "바위", "보"};
		System.out.println("나의 선택 ="+ dice[myNum-1]);
		System.out.println("컴퓨터 선택 ="+dice[comNum-1]);
		
		if(myNum ==1 && comNum==3 || myNum ==2 && comNum==1 || myNum==3 && comNum==2) {
			System.out.println("이겼다");
		}else if(myNum ==comNum) {
			System.out.println("비겼다");
		}else {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			System.out.println("졌다.");
		}
		
		}
	}


