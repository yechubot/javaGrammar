package javaproject;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		System.out.println("���� ������?(1.���� 2.���� 3.��)");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
		
		int comNum = (int)(Math.random()*3+1);
		String dice[] = {"����", "����", "��"};
		System.out.println("���� ���� ="+ dice[myNum-1]);
		System.out.println("��ǻ�� ���� ="+dice[comNum-1]);
		
		if(myNum ==1 && comNum==3 || myNum ==2 && comNum==1 || myNum==3 && comNum==2) {
			System.out.println("�̰��");
		}else if(myNum ==comNum) {
			System.out.println("����");
		}else {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			System.out.println("����.");
		}
		
		}
	}


