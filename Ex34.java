package javaproject;

import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		String itemsArray[] = {"����", "�����", "�Ŷ��", "����", "������ġ"};
		int price[] = {2500, 1200, 1500, 3000, 3500};
		
		System.out.print("1.���� 2.����� 3.�Ŷ�� 4.���� 5.������ġ (ǰ�� ��ȣ�� �Է��ϼ���)");
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		
		System.out.print("���� ������ ?");
		int counts = sc.nextInt(); 
		int totalPrice =0;
		
		totalPrice = price[items-1]*counts;
		System.out.println("������"+itemsArray[items-1]+"�� ��� �ݾ�="+totalPrice);
		/*
		  for(int i=0; i<5; i++) {
		 
			if(items==i+1) {
				totalPrice =counts*price[i];
				System.out.println(itemsArray[i]+"�� ������"+totalPrice+"�Դϴ�");
			}
			
		}*/
		
		
	}
	
	}
