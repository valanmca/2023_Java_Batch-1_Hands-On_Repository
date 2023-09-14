package com.gayathri.day8;

class Student{
	
	String name;
	int rollno;
	String qualification;
	
	Student(String name,int rollno,String qualification){
		this.name = name;
		this.rollno = rollno;
		this.qualification = qualification;
	}
	
	void display() {
		System.out.println("\nName : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Qualification : "+qualification);
	}
}

public class StudentClassObject {

	public static void main(String[] args) {
		
		Student stud1 = new Student("Dharshana",11953,"MCA");
		stud1.display();

		Student stud2 = new Student("Gayathri",11954,"MBA");
		//stud2.display();
		
	}

}
