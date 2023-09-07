package com.jenish.day08;
class Student{
	//variables
	int rollno;
	String sname;
	String std;
	
	//Constructor
	Student(int rollno,String sname,String std){
		this.rollno=rollno;
		this.sname=sname;
		this.std=std;
	}
	//Methods
	void display() {
		System.out.println("Roll No:" +rollno);
		System.out.println("StudentName:" +sname);
		System.out.println("Standard:" +std);
	}
}
public class Oops_ClassCreation_Student_Ex3 {

	public static void main(String[] args) {
		//Object creation and Constructor Calling
		Student jenish=new Student(101,"Jenish","CSE");
		jenish.display();
		
		Student muthuraj=new Student(102,"MuthuRaj","CSE");
		muthuraj.display();

	}

}
