package javaproject;

import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		
		/*1~100 ���� ���߱� ����
		  1~100 ���� �Է�>
		     ���ڰ� Ů�ϴ�. ���� ���� ��������
		  1~100 ���� �Է�>
		  ���ڰ� �۽��ϴ�. ū ���� ��������
		  �̷���..
		  �����մϴ� ���߼ʽ��ϴ�(�õ�Ƚ��: ȸ)
		*/ 
		
		/* Ǫ�� ��� -
		 random �� ���� ��ǻ�Ͱ� 1-100 ����� ���� 
		 ���� �κ� �ݺ� ����.. 
		 ��ĳ�ʷ� �Է�
		 if�� ��, ���ߴ� ��� �ݺ��� Ż��
		 
		 
		 */
		 
		System.out.println("1-100 ���� ���߱� ����");
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int num;
		int count=0;
		
		while(true) {
		System.out.print("1~100 ���� �Է�>");
		num = scan.nextInt();
		count++;
		
		if(num > random) {
			System.out.println("���ڰ� Ů�ϴ�. ���� ���� ��������.");
		}else if(num < random) {
			System.out.println("���ڰ� �۽��ϴ�. ū���� ��������.");			
		}else{
			
			System.out.println("�����մϴ�. ���߼̽��ϴ�. (�õ�Ƚ��:"+count+")");
			break;
		} 
	}

	
}

}