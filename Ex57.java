package javaproject;

public class Ex57 {

	public static void main(String[] args) {
		
		CheckingAccount chulsu = new CheckingAccount("111-222-12334", "김철수", 0, "1111-2222-3333-4444");
		chulsu.deposit(100000);
		try {
			int paidAmount = chulsu.pay("1111-2222-3333-4444", 300000);
			System.out.println("지불액:"+paidAmount);
			System.out.println("잔액:"+chulsu.balance);
			//카드번호 틀려서  catch로 넘어감 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

	
}

