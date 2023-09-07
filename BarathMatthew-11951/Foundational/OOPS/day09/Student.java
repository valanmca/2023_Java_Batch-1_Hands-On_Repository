package com.matthew.day09;

public class Student {
	String name;
	float mark1;
	float mark2;
	float mark3;

	Student(String name,float mark1,float mark2,float mark3){
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Total : " + (mark1+mark2+mark3));
	}
	void average() {
		System.out.println("Average of "+name+" : "+ ((mark1+mark2+mark3)/3));
	}
	
	public static void main(String[] args) {
		
		Student matthew = new Student("Matthew",89.3f,95.4f,93.0f);
		Student barath = new Student("Barath",79.32f,86.01f,91.3f);
		matthew.display();
		matthew.average();
		barath.display();
		barath.average();

	}

}
