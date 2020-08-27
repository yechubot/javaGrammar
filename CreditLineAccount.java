package javaproject;
//마이너스 통장 클래스
public class CreditLineAccount extends Account {
	//마이너스 한도 필드
	int creditLine;
	
	//생성자
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo,ownerName, balance); // Account 에 이미 있는 것 -> super 로 받음
		this.creditLine = creditLine;
	}
	
	//부모가 있는 method 아닌, 재정의 함 - overriding
	@Override // 밑의 method override로 명시
	int withdraw(int amount) throws Exception {
		if((balance+creditLine) < amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		balance-= amount; 
		return amount;
	}
}
