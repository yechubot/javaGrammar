package javaproject;

public class Ex62 {

	public static void main(String[] args) {
		EmailSender chulsu = new EmailSender("생일을 축하합니다", "고객센터", "admin@abcshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		
		SMSSender youngHee = new SMSSender("생일을 축하합니다", "고객센터", "01-111-1111", "10% 할인쿠폰이 발행되었습니다");
		
		chulsu.sendMessage("gildong@naver.com");
		chulsu.sendMessage("chanho@naver.com");
		youngHee.sendMessage("010-2020-3030");
				
		}
	
}

