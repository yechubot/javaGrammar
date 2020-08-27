package javaproject;

import java.util.Scanner;

public class BankApplication {
	private static Account3[] accountArray = new Account3[100];
	private static Scanner scanner = new Scanner(System.in);
	int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			switch(selectNo) {
				case 1:
					createAccount();
					break;
				
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					run = false;
			}
			
			
		}
	
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account3 newAccount = new Account3(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i]= newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	
		
	}
	
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i=0; i<accountArray.length; i++) {
			Account3 account3 = accountArray[i];
			if(account3!= null) {
				System.out.print(account3.getAno());
				System.out.print("    ");
				System.out.print(account3.getOwner());
				System.out.print("    ");
				System.out.print(account3.getBalance());
				System.out.println();
			} else {
				break;
			}
		}
		
	}
	
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		Account3 account3 = findAccount(ano);
		if(account3==null) {
			System.out.println("결과: 계좌가 없습니다.");
		}else {
			account3.setBalance(account3.getBalance()+balance);
			System.out.println("결과:입금이 성공되었습니다.");
		}
		
	}
	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		Account3 account3 = findAccount(ano);
		if(account3==null) {
			System.out.println("결과: 계좌가 없습니다.");
		}else if(account3.getBalance() <balance){
			System.out.println("결과: 출금액이 예금액을 초과합니다.");
		} else{
			account3.setBalance(account3.getBalance()-balance);
			System.out.println("결과:출금이 성공되었습니다.");
		}
	}
	
	private static Account3 findAccount(String ano) {
		Account3 account3 = null;
		for(int i = 0; i <accountArray.length; i++) {
			String dbAno = accountArray[i].getAno();
			if(dbAno.equals(ano)) {
				account3 = accountArray[i];
				break;
			}
		}
		return account3;
	}
	
}

