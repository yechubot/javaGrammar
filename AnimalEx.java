package javaproject;

public class AnimalEx {

	public static void main(String[] args) {
		Tiger hodol = new Tiger();
		Eagle suri = new Eagle();
		hodol.name = "호돌이";
		suri.name= "수리";
		hodol.age = 5;
		suri.home = "오봉바위";
		
		System.out.println(hodol.name+"는 나이가 "+hodol.age+"살 입니다.");
		System.out.print(hodol.name+"는 "); hodol.move();
		System.out.println(suri.name+"는 "+ suri.home+"에 삽니다.");
		System.out.print(suri.name+"는 "); suri.move();
	}

	
}

