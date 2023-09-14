package com.jenish.day09;

class Student{
	String name;
	int m1;
	int m2;
	int m3;
	Student(String name,int m1, int m2, int m3)
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	void total(){
		float avg=(m1+m2+m3)/3;
		System.out.println("Average: "+avg);
	}
	void display() {
		System.out.println("Name: "+name);
		int total=m1+m2+m3;
		System.out.println("Total: "+total);
	}      
	
}
public class Oops_Assign_Class_Object_Task2 {

	public static void main(String[] args) {
		Student obj=new Student("Jenish",70,60,50);
		obj.total();
		obj.display();
	}

}
