package com.swetha.day9;

public class Student {
	String name;
	float m1;
	float m2;
	float m3;
	
	
	//constructor
	Student(String name,float m1,float m2,float m3 ){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	float total() {
		float sum=m1+m2+m3;
		return sum;
	}
	float avg() {
		
		float avg=total()/3;
		return avg;
	}
	void display() {
		
		System.out.println("Student name :"+name);
		System.out.println("Student total is : "+total());
		System.out.println("Student average : "+avg());
	}

	public static void main(String[] args) {
		Student obj=new Student("Swetha",67.0f,78.0f,89.0f);
		obj.display();

		
		Student obj1=new Student("Hephzi",78.0f,89.0f,90.0f);
		obj1.display();
	}

}
