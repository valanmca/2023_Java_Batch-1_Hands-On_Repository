package com.swetha.day10;
class Person1{                  //Hierarchial inheritance example
	void displayName() {
		System.out.println("My name is Swetha");
	}
}
class Employe1 extends Person1{
	void displaySalary() {
		System.out.println("My salary is 50,000");
	}
}
class Student extends Person1{
	void displayRollNo() {
		System.out.println("My roll no is 11956");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.displayName();
		obj.displayRollNo();
		
		Employe1 obj1=new Employe1();
		obj1.displayName();
		obj1.displaySalary();
		
		

	}

}
