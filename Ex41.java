package javaproject;

public class Ex41 {
	public static void main(String[] args){
		int num[] = {86,99,80,70,63};
		String[] name = {"김철수","이영희","홍길동","박찬호","이영표"};
		// 결과가 높은 점수부터 낮은 점수로 배열되게 식을 짜보기
		//sort algorithm
		int temp;
		String temp2;
		for(int a=0; a<num.length-1; a++) {
			for(int b=a+1; b<num.length; b++) {
				if(num[a] < num[b]) {
					temp=num[a];
					temp2=name[a];
					
					num[a]=num[b];
					name[a]=name[b];
					
					num[b]=temp;
					name[b]=temp2;
					 
				}
			}
		}
		System.out.println("**성적표**");
		for(int i=0; i<num.length; i++) {
		
			System.out.println(i+1+"등 "+name[i]+" "+num[i]+"점");
		}
	}
	
	}
