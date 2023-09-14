package com.swetha.day8;
class Student{
	int srollNo;
	int sclass;
	String sName;
	
	//Constructor
	Student(int rollNo,int clas,String Name){
		srollNo=rollNo;   // 'this' keyword not used if the local variable and instance variables are different
		sclass=clas;
		sName=Name;
		
	}
	void display() {
		System.out.println("Student roll no : "+srollNo);
		System.out.println("Student class : "+sclass);
		System.out.println("Student name : "+sName);
	}
}
public class StudentClassObj {

	public static void main(String[] args) {
		Student arun=new Student(1,9,"arun");
		arun.display();
		
		Student swetha=new Student(1,10,"swetha");
		swetha.display();

	}

}
