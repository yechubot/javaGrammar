package javaproject;

public class Ex11 {
	public static void main(String[] args) {
		
		int oddSum = 0, evenSum = 0;
		for(int i =1; i<=100; i++) {
			if(i%2 == 0) {
				evenSum += i;
			}else {
				oddSum += i; //똑같이 더하되, 짝수, 홀수를 분배함.
			}
		}
		System.out.println("1부터 100까지의 홀수의 합="+oddSum);
		System.out.println("1부터 100까지의 짝수의 합="+evenSum);
	
	}

}
