package javaproject;

public class Ex31 {
	public static void main(String[] args) {
		
	int score[] = {80,85,93, 80, 71};
	int total = 0;
	double avg;
	
	for (int i=0; i<score.length; i++) {
		total +=score[i];
	}
	System.out.println("score="+total);
	avg = (double)total/score.length;
	System.out.println("averge="+avg);
	}
	
	}
