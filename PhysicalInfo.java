package javaproject;

public class PhysicalInfo {
	//field
	String name;
	int age; 
	float height, weight;
	
	//Constructor
	public PhysicalInfo() {
		
	}
	
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name; // this - field
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//method
	void update(int age) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	void update(int age, float height) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
}
