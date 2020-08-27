package javaproject;

public class Square extends Rectangle2{
	public Square(int sideLength) {
		super(sideLength, sideLength);
	}
	int getSideLength() {
		return getWidth();
	}
	
}
