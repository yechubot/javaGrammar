package javaproject;

public class CheckingAccount extends Account{
	String cardNo; // 카드
	
	// 생성자
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	//카드로 지불하는 method
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)) {
			throw new Exception("카드번호가 일치하지 않아 지불이 불가능합니다.");
		}else {
			return withdraw(amount);
		}
	}
}
