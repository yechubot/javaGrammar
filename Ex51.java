package javaproject;

public class Ex51 {
	public static void main(String[] args){
		int area=0;
		Rectangle rect1 = null;
		try {
			rect1 = new Rectangle(20,30);
			area = rect1.getArea();
			System.out.println("�簢���� ����:"+rect1.getWidth());
			System.out.println("�簢���� ����:"+rect1.getHeight());
			System.out.println("�簢���� ����:"+area);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		
		
	}
	
	}
