package javaproject;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		System.out.println("������ ����(1.���� 2.���� 3.������)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("1�� �ȳ�����ũ�� ������");
			break;
		case 2:
			System.out.println("2�� �ȳ�����ũ�� ������");
			break;
			
		case 3:
			System.out.println("3�� �ȳ�����ũ�� ������");
			break;
			
		default:
			System.out.println("���� Ʋ��!");
	
		}
		}

}
