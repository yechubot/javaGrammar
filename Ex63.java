package javaproject;

import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		
		/*1~100 숫자 맞추기 게임
		  1~100 숫자 입력>
		     숫자가 큽니다. 작은 수를 넣으세요
		  1~100 숫자 입력>
		  숫자가 작습니다. 큰 수를 넣으세요
		  이런식..
		  축하합니다 맞추셥습니다(시도횟수: 회)
		*/ 
		
		/* 푸는 방법 -
		 random 에 의해 컴퓨터가 1-100 만드는 내용 
		 일정 부분 반복 수행.. 
		 스캐너로 입력
		 if로 비교, 맞추는 경우 반복문 탈출
		 
		 
		 */
		 
		System.out.println("1-100 숫자 맞추기 게임");
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int num;
		int count=0;
		
		while(true) {
		System.out.print("1~100 숫자 입력>");
		num = scan.nextInt();
		count++;
		
		if(num > random) {
			System.out.println("숫자가 큽니다. 작은 수를 넣으세요.");
		}else if(num < random) {
			System.out.println("숫자가 작습니다. 큰수를 넣으세요.");			
		}else{
			
			System.out.println("축하합니다. 맞추셨습니다. (시도횟수:"+count+")");
			break;
		} 
	}

	
}

}