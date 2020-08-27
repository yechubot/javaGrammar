package javaproject;

public class Ex48 {

	public static void main(String[] args) {
		int amount=0;
		Account younghee = new Account("222-333-4444", "이영희", 10);
		Account chulsu = new Account(); // 선언과 동시에 객체 변수 생성
		chulsu.accountNo = "111-222-33333";
		chulsu.ownerName = "김철수";
		chulsu.balance = 100;
		
		Account gildong = new Account();
		gildong.accountNo = "111-222-34343";
		gildong.ownerName = "고길동";
		gildong.balance = 0;
		
		chulsu.deposit(1000);
		chulsu.deposit(2000);
		gildong.deposit(30000);
		try {
			amount = gildong.withdraw(50000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("길동 인출액: "+ amount);
		printAccount(gildong);
		printAccount(chulsu);
		printAccount(younghee);
	}// main method done
	
	//계좌 출력  method
	static void printAccount(Account obj) {
		System.out.println("계좌번호: "+obj.accountNo);
		System.out.println("예금주 이름: "+obj.ownerName);
		System.out.println("잔액: "+obj.balance);
		System.out.println();
	}
	
}


