package javaproject;

public class Rectangle {
	// field
	private int width, height;
	
	//Constructor
	public Rectangle(int width, int height) throws Exception {
		if(width <=0 || height <=0 ) {
			throw new Exception("���̿� ���̴� �÷��� ���̾�� �մϴ�.");
		}
		this.width = width;
		this.height = height;
	}
	
	//method
	int getArea() {
		return width*height;
	}
	//����  method
	int getWidth() {
		return width;
	}
	//���� method
	int getHeight() {
		return height;
	}
	void setWidth(int width) {
		if(width>0) {
		this.width = width;
	}else {
		System.out.println("����� ��������");
	}
		}
	void setHeight(int height) {
		if(height>0) {
		this.height = height;
		}else {
			System.out.println("����� ��������");
		}
		}
}
