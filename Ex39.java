package javaproject;

public class Ex39 {
	public static void main(String[] args){
		String[] str = {"�ڹ�", "�ȵ���̵�", "�Ƶ��̳�"};
		String[] newStr = new String [5];
		for(int i=0; i<str.length; i++) {
			newStr[i]=str[i];
		}
		for(int i=0; i<newStr.length; i++) {
			System.out.println(newStr[i]+",");
		}
		
	}
	
	}
