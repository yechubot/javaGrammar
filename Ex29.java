package javaproject;

import java.util.Scanner;

public class Ex29 {
	
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("����> ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("���ݾ�>");
				balance+=scanner.nextInt(); // balance = balance + scanner.nextInt();
				break;
			case 2:
				System.out.println("��ݾ�>");
				
				int money = scanner.nextInt();
				if(balance >= money) {
					balance-=money;
				}else {
				System.out.println("�ܾ��� �����մϴ�");
				}
				break;
			case 3: 
				System.out.println("�ܰ�>");
				System.out.println(balance);
				break;
			case 4:
				run=false;
				break;
			default:
					System.out.println("�ٽ� �Է����ּ���.");
					break;
			}
			
		}
		System.out.println("���α׷� ����");
	}
}