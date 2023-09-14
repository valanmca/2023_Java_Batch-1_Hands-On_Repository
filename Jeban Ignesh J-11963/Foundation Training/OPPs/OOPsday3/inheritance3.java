package com.jeban.OOPsday3;

class Person1 {
	void displayName() {
		System.out.println("n1:" + "Jeban Ignesh J");
		System.out.println("n2:" + "Domnic Dev k");
		System.out.println("n3:" + "Sarabudheen ");
	}
}

class Employee1 extends Person1 {
	void Salary() {
		System.out.println("n1 Salary is:" + 8542);
		System.out.println("n2 Salary is:" + 8542);
		System.out.println("n3 Salary is:" + 1000000);
	}
}

class Student extends Person1{
	void RollNumber() {
		System.out.println("n1 Rno is: "+101);
		System.out.println("n2 Rno is: "+102);
		System.out.println("n3 Rno is: "+103);
	}
}

public class inheritance3 {

	public static void main(String[] args) {
		Student obj=new Student();
		Employee obj1=new Employee();
		obj.displayName();
		obj1.Salary();
		obj.RollNumber();
		
	

	}

}
