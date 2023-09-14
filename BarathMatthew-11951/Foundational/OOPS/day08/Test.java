package com.matthew.day08;

class Student{
	//variable
	String sname;
	int sage;
	float smark;
	
	//constructor
	Student(String name,int age,float mark){
		sname = name;
		sage = age;
		smark = mark;
	}
	//method
	
	void qualify() {
		if ((smark/2)>50) {
			System.out.println("You are Qualified");
		}
		else {
			System.out.println("Not qualify");
		}
	}
}
public class Test {
	
	public static void main(String[] args) {
		// creating an object
		Student matthew = new Student("Matthew",21,175.76f);
		matthew.qualify();
	}

}
