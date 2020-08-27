package javaproject;

public class Ex54 {
	public static void main(String[] args){
		Member user1 = new Member("홍길동", "hong");
		user1.name = "김철수";
		MemberService gildong = new MemberService();
		
		boolean result = gildong.login("hong", "12345");
			if(result) {
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
			}
			gildong.logout("hong");
		}
	
	}

