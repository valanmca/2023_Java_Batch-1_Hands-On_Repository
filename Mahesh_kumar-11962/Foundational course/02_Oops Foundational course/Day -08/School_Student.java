package com.mahesh.Oops_day8;


class Student
{
	String name;
	int rollno;
	int age;
	int std;
	
	Student(String name,int rollno,int age,int std)
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.std=std;
	}
	
	
	void disp()
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student Rollno : "+rollno);
		System.out.println("Student Age : "+age);
		System.out.println("Student Std : "+std+"th");
		System.out.println();
	}
	
}
public class School_Student {

	public static void main(String[] args) {
	
		Student mah = new Student("Mahesh",23,12,9);
		mah.disp();
		
		Student kani = new Student("Kaniraj",20,16,12);
		kani.disp();


	}

}
