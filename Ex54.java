package javaproject;

public class Ex54 {
	public static void main(String[] args){
		Member user1 = new Member("ȫ�浿", "hong");
		user1.name = "��ö��";
		MemberService gildong = new MemberService();
		
		boolean result = gildong.login("hong", "12345");
			if(result) {
				System.out.println("�α��� �Ǿ����ϴ�.");
			}else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
			}
			gildong.logout("hong");
		}
	
	}

