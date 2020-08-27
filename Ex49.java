package javaproject;


public class Ex49 {

	public static void main(String[] args) {
		PhysicalInfo younghee;
		younghee = new PhysicalInfo("이영희", 10, 132.0f, 35.0f);
		
		PhysicalInfo chulsu = new PhysicalInfo("이철수", 7, 100, 23);
		
		printPhysicalInfo(younghee);
		printPhysicalInfo(chulsu);
		
		younghee.update(11, 145.0f, 45.0f);
		
		printPhysicalInfo(younghee);
		
		younghee.update(12, 157.0f);
		
		printPhysicalInfo(younghee);
		
		younghee.update(13);
		
		printPhysicalInfo(younghee);
	}
	
	//성장일기 출력  method
	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println(obj.name+"의 성장일기");
		System.out.println("나이: "+obj.age);
		System.out.println("키: "+obj.height);
		System.out.println("몸무게: "+obj.weight);
		System.out.println("==================");
	}
	
}


