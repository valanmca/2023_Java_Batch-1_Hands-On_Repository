package com.dharshu.day8;

class Student{
	int rollno;
	String name;
	String Qualify;
	
	Student(int rollno,String name,String Qualify){
		this.rollno=rollno;
		this.name=name;
		this.Qualify=Qualify;
	}
	
	void display() {
		System.out.println("Student roll no:"+rollno);
		System.out.println("Student Name:"+name);
		System.out.println("Student Qualification:"+Qualify);
	}
}

public class StudentClassObject {

	public static void main(String[] args) {
		Student std=new Student(01,"Dharshu","MCA");
		std.display();
		
		Student std1=new Student(02,"Gayu","BCA");
		std1.display();
		
		Student std2=new Student(03,"Kavi","BE");
		std2.display();

	}

}
