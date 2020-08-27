package javaproject;

public class iAnimalEx {
	public static void main(String[] args){
		printSound(new iCat());
		printSound(new iDog());
		}
		
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	}

