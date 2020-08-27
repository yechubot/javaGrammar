package javaproject;


public class Ex33 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			int intArg = Integer.parseInt(args[i]);
			sum +=intArg;
		}
		System.out.println(sum);
	
}
	
	}
