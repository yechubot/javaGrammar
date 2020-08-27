package javaproject;

public class Itiger extends Animal implements Animal2{


	@Override
	public void eat() {
		System.out.println("네발로 이동한다.");
		
	}
	@Override
	void move() {
		System.out.println("멧되지를 잡아먹는다.");
		
	}

}
