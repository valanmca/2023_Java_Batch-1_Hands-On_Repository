package com.domnic.day8;

class Student{
	String name;
	int rollno;
	String standard;
	char section;
	
	Student(String name,int rollno,String standard,char section){
		this.name=name;
		this.rollno=rollno;
		this.standard=standard;
		this.section=section;
		}
		
		void display(){
			System.out.println("Name :"+name);
			System.out.println("Rollno  :"+rollno);
			System.out.println("Standard :"+standard);
			System.out.println("Section :"+section);
			
		
	}
}
public class Oops3 {

	public static void main(String[] args) {
		Student domnic=new Student("Domnic",176,"XII",'A');
		domnic.display();
		System.out.println();
		Student jeban=new Student("Jeban",170,"XII",'B');
		jeban.display();
		System.out.println();
		Student muthuraj=new Student("Muthuraj",150,"XII",'C');
		muthuraj.display();

	}

}
