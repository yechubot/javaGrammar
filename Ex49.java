package javaproject;


public class Ex49 {

	public static void main(String[] args) {
		PhysicalInfo younghee;
		younghee = new PhysicalInfo("�̿���", 10, 132.0f, 35.0f);
		
		PhysicalInfo chulsu = new PhysicalInfo("��ö��", 7, 100, 23);
		
		printPhysicalInfo(younghee);
		printPhysicalInfo(chulsu);
		
		younghee.update(11, 145.0f, 45.0f);
		
		printPhysicalInfo(younghee);
		
		younghee.update(12, 157.0f);
		
		printPhysicalInfo(younghee);
		
		younghee.update(13);
		
		printPhysicalInfo(younghee);
	}
	
	//�����ϱ� ���  method
	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println(obj.name+"�� �����ϱ�");
		System.out.println("����: "+obj.age);
		System.out.println("Ű: "+obj.height);
		System.out.println("������: "+obj.weight);
		System.out.println("==================");
	}
	
}


