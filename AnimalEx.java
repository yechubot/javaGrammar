package javaproject;

public class AnimalEx {

	public static void main(String[] args) {
		Tiger hodol = new Tiger();
		Eagle suri = new Eagle();
		hodol.name = "ȣ����";
		suri.name= "����";
		hodol.age = 5;
		suri.home = "��������";
		
		System.out.println(hodol.name+"�� ���̰� "+hodol.age+"�� �Դϴ�.");
		System.out.print(hodol.name+"�� "); hodol.move();
		System.out.println(suri.name+"�� "+ suri.home+"�� ��ϴ�.");
		System.out.print(suri.name+"�� "); suri.move();
	}

	
}

