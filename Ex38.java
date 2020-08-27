package javaproject;

public class Ex38 {
	public static void main(String[] args){
		int[] num = {10,20,30};
		int[] newNum = new int[5];
		for(int i=0; i<num.length; i++) {
			newNum[i]=num[i];
		}
		for(int i=0; i<newNum.length; i++) {
			System.out.println(newNum[i]+", ");
		}//비어있는 것은 0 들어감
		
	}
	
	}
