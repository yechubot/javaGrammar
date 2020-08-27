package javaproject;

public class Ex18 {
	public static void main(String[] args) {
		
		int weight;
		 for(int a = 1; a<=30; a++) {//a = 2kg, b = 3kg
			 for(int b =1; b<=30; b++) {
				weight=2*a + 3*b;
				if(weight==30){
					System.out.println("2kgs:" +a+" 3kgs:" +b);
				}
			 }
		 }
		
		
	}

}

