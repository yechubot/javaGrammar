package javaproject;


public class Ex44 {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		System.out.println("today is "+today.name());
		System.out.println("today is "+today.ordinal());
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		System.out.println(day1.compareTo(day2));
		Week weekDay = Week.valueOf("SUNDAY");
		System.out.println(weekDay);
		Week days[] = Week.values();
		for(Week day: days) {
			System.out.println(day);
			
		}
	
	}

	
}

