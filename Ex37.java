package javaproject;


public class Ex37 {
	public static void main(String[] args){
		int[][]ma=new int[3][3]; //3*3 array
		int row=0, col=0; //row 행, column 열
		int num =1; //array에 가장 먼저 넣는 값
		col=ma[0].length/2;// 첫 행의 중간
		ma[row][col]=num;
		for(num=2; num<=ma[0].length*ma[0].length; num++) {
			//대각선 위로
			row--;
			col++;
			
			//행과 열 모두 없음 , &&는 무조건 맨 처음에 물어본다 
			if(row<0 && col==ma[0].length) {
				row+=2;
				col--;
			}
		
			//행 없음
			if(row<0) {
				//마지막 행으로 이동
				row=ma[0].length-1;
			}
			// 열 없음
			if(col==ma[0].length) {
				col = 0; //첫 열로 이동 
			}
			// 값 존재 - 초기값은 0 이니까
			if(ma[row][col]!=0) {
				row+=2;
				col--;	
			}//비어있을 경우 if문 통과해서 밑의 실행문 실행
			
			ma[row][col] = num;
			
		} //2차원 배열의 출력 for문 2개 필요
		 for(int a=0; a<ma.length; a++) { //or a<ma.[0].length 
			 for(int b=0; b<ma.length; b++) {
				 System.out.print(ma[a][b]+" ");
			 }System.out.println();
		 }
	}
	
	}
