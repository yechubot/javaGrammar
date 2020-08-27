package javaproject;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("당신의 몸무게는?");
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		System.out.println("당신의 키는?");
		int height = sc.nextInt();
		int standard = (int) ((height-100)*0.9);
		
		if(weight > standard+5) {
			System.out.println("비만입니다.");
			System.out.println("-"+(weight-standard+5)+"kg 감소 필요");
		}else if (weight < standard-5) {
			System.out.println("마른체형입니다.");
			System.out.println("+"+(standard-weight-5)+"kg 증가 필요");
		} else {
			System.out.println("정상입니다.");
		}
		System.out.println("+는 살을 찌우시고, -는 살을 빼세요");
	}

}
