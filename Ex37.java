package javaproject;


public class Ex37 {
	public static void main(String[] args){
		int[][]ma=new int[3][3]; //3*3 array
		int row=0, col=0; //row ��, column ��
		int num =1; //array�� ���� ���� �ִ� ��
		col=ma[0].length/2;// ù ���� �߰�
		ma[row][col]=num;
		for(num=2; num<=ma[0].length*ma[0].length; num++) {
			//�밢�� ����
			row--;
			col++;
			
			//��� �� ��� ���� , &&�� ������ �� ó���� ����� 
			if(row<0 && col==ma[0].length) {
				row+=2;
				col--;
			}
		
			//�� ����
			if(row<0) {
				//������ ������ �̵�
				row=ma[0].length-1;
			}
			// �� ����
			if(col==ma[0].length) {
				col = 0; //ù ���� �̵� 
			}
			// �� ���� - �ʱⰪ�� 0 �̴ϱ�
			if(ma[row][col]!=0) {
				row+=2;
				col--;	
			}//������� ��� if�� ����ؼ� ���� ���๮ ����
			
			ma[row][col] = num;
			
		} //2���� �迭�� ��� for�� 2�� �ʿ�
		 for(int a=0; a<ma.length; a++) { //or a<ma.[0].length 
			 for(int b=0; b<ma.length; b++) {
				 System.out.print(ma[a][b]+" ");
			 }System.out.println();
		 }
	}
	
	}
