package javaproject;

public class Ex61 {

	public static void main(String[] args) {
		Car myCar = new Car(); //myCar �ν���Ʈ ��ü ����
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = myCar.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("�տ��� HankookTire�� ��ü");
					myCar.frontLeftTire = new HankookTire("�տ���", 15);
					break;
				case 2:
					System.out.println("�տ�����  KumhoTire�� ��ü");
					myCar.frontRightTire = new KumhoTire("�տ�����", 13);
					break;
				case 3:
					System.out.println("�ڿ��� HankookTire�� ��ü");
					myCar.backLeftTire = new HankookTire("�ڿ���", 14);
					break;
				case 4:
					System.out.println("�ڿ����� KumhoTire�� ��ü");
					myCar.backRightTire = new KumhoTire("�ڿ�����", 17);
					break;
			}		
			System.out.println("-----------------------------------");
		}
		
		}
	
}

