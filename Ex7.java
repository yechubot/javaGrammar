package javaproject;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("����� �����Դ�?");
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		System.out.println("����� Ű��?");
		int height = sc.nextInt();
		int standard = (int) ((height-100)*0.9);
		
		if(weight > standard+5) {
			System.out.println("���Դϴ�.");
			System.out.println("-"+(weight-standard+5)+"kg ���� �ʿ�");
		}else if (weight < standard-5) {
			System.out.println("����ü���Դϴ�.");
			System.out.println("+"+(standard-weight-5)+"kg ���� �ʿ�");
		} else {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("+�� ���� ���ð�, -�� ���� ������");
	}

}
