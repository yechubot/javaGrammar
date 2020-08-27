package javaproject;

public class Ex58 {

	public static void main(String[] args) {
		CreditLineAccount gildong = new CreditLineAccount("222-111-23232", "홍길동", 10000, 2000000);
		gildong.deposit(50000);
		
		try {
			int amount = gildong.withdraw(1000000);
			System.out.println("인출액: "+amount);
			System.out.println("잔액: "+gildong.balance);
			System.out.println("마이너스 한도:"+gildong.creditLine);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}

	
}

