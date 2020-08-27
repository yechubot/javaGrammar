package javaproject;

public class Ex59 {

	public static void main(String[] args) {
		DokdoPointAccount youngHee = new DokdoPointAccount("111-222-010101", "이영희", 0, 0);
		
		youngHee.deposit(500000);
		System.out.println("잔액:"+youngHee.balance);
		System.out.println("독도사랑기금 누적포인트:"+youngHee.dokdoPoint);
		
		youngHee.deposit(100000);
		System.out.println("잔액:"+youngHee.balance);
		System.out.println("독도사랑기금 누적포인트:"+youngHee.dokdoPoint);
		
	}
	
}

