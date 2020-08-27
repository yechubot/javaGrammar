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
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			
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
	
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		Account3 newAccount = new Account3(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i]= newAccount;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	
		
	}
	
	private static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();
		Account3 account3 = findAccount(ano);
		if(account3==null) {
			System.out.println("���: ���°� �����ϴ�.");
		}else {
			account3.setBalance(account3.getBalance()+balance);
			System.out.println("���:�Ա��� �����Ǿ����ϴ�.");
		}
		
	}
	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		Account3 account3 = findAccount(ano);
		if(account3==null) {
			System.out.println("���: ���°� �����ϴ�.");
		}else if(account3.getBalance() <balance){
			System.out.println("���: ��ݾ��� ���ݾ��� �ʰ��մϴ�.");
		} else{
			account3.setBalance(account3.getBalance()-balance);
			System.out.println("���:����� �����Ǿ����ϴ�.");
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

