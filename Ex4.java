package javaproject;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		System.out.print("���׼���?");
		Scanner sc = new Scanner(System.in);
		int mathScore = sc.nextInt();
		System.out.print("�����?");
		int englishScore = sc.nextInt();
		
		if( mathScore >= 80 || englishScore >= 80) {
			System.out.println("��ô�ȸ ���������մϴ�!");
		} else {
			System.out.println("���� ��ȸ�� ��ٸ�����");
		}
		
 }
	
}


