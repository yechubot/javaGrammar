package javaproject;

public class MemberService {
	String id;
	String password;
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")){
		return true;
		
		}else {
		return false;
		}
	}
	
	public void logout(String id) {
		if(id.equals("hong")) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	}
}
