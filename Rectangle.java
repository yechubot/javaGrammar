package javaproject;

public class Rectangle {
	// field
	private int width, height;
	
	//Constructor
	public Rectangle(int width, int height) throws Exception {
		if(width <=0 || height <=0 ) {
			throw new Exception("넓이와 높이는 플러스 값이어야 합니다.");
		}
		this.width = width;
		this.height = height;
	}
	
	//method
	int getArea() {
		return width*height;
	}
	//넓이  method
	int getWidth() {
		return width;
	}
	//높이 method
	int getHeight() {
		return height;
	}
	void setWidth(int width) {
		if(width>0) {
		this.width = width;
	}else {
		System.out.println("양수를 넣으세요");
	}
		}
	void setHeight(int height) {
		if(height>0) {
		this.height = height;
		}else {
			System.out.println("양수를 넣으세요");
		}
		}
}
