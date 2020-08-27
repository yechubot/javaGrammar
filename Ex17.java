package javaproject;

public class Ex17 {
	public static void main(String[] args) {
		int sum;
		
		//a µÅÁö , b Å¸Á¶
		 for(int a = 1; a<=17; a++) {
			 for(int b =1; b<=17; b++) {
				sum=a*4+b*2;
				if(sum==56 && a+b==17) {
					System.out.println("pigs: " +a);
					System.out.println("osts: " +b);
					
				}
			 }
		 }
		
		
	}

}

