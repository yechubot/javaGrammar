package javaproject;

public class Ex12 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		for(i=1; i<=100; i++) {
			sum+= i; // sum = sum + i
			if(sum>3750) {
				break;
				/* ³» ÄÚµå
				 sum+= i;
				if(sum>3750) {
					System.out.println(i);
					break;
					
				} */
				
			}
			
		}
			
		System.out.println(i);
		
	}

}
