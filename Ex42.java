package javaproject;

public class Ex42 {
	public static void main(String[] args){
		int scores[] = {96,75,88,87,70};
		int totalScore=0;
		double avrScore;
		
		for(int a:scores) {
			totalScore+=a;
		}
		avrScore = (double)totalScore/scores.length;
		System.out.println("**����ǥ**");
		System.out.println("����:"+totalScore);
		System.out.printf("���=%4.1f",avrScore);
		
	}
	
	}
