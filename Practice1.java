package javaproject;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		String str [] = {"��", "ȭ", "��", "��", "��", "��", "��"};
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ����>");
		String day = sc.next();
		
		if(day.equals(str[6])|| day.equals(str[5])) {
			System.out.println("�ָ�!");
		}else {
			System.out.println("����!");
		}
	}
		
}
		
	

