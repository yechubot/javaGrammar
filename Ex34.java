package javaproject;

import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		String itemsArray[] = {"우유", "새우깡", "컵라면", "맥주", "샌드위치"};
		int price[] = {2500, 1200, 1500, 3000, 3500};
		
		System.out.print("1.우유 2.새우깡 3.컵라면 4.맥주 5.샌드위치 (품목 번호를 입력하세요)");
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		
		System.out.print("구입 수량은 ?");
		int counts = sc.nextInt(); 
		int totalPrice =0;
		
		totalPrice = price[items-1]*counts;
		System.out.println("구입한"+itemsArray[items-1]+"의 계산 금액="+totalPrice);
		/*
		  for(int i=0; i<5; i++) {
		 
			if(items==i+1) {
				totalPrice =counts*price[i];
				System.out.println(itemsArray[i]+"의 가격은"+totalPrice+"입니다");
			}
			
		}*/
		
		
	}
	
	}
