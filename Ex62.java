package javaproject;

public class Ex62 {

	public static void main(String[] args) {
		EmailSender chulsu = new EmailSender("������ �����մϴ�", "������", "admin@abcshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		
		SMSSender youngHee = new SMSSender("������ �����մϴ�", "������", "01-111-1111", "10% ���������� ����Ǿ����ϴ�");
		
		chulsu.sendMessage("gildong@naver.com");
		chulsu.sendMessage("chanho@naver.com");
		youngHee.sendMessage("010-2020-3030");
				
		}
	
}

