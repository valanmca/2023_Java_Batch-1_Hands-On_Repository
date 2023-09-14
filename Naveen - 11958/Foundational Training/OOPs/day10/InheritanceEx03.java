package com.naveen.day10;

//Hierarchical Inheritance program.. 
class person1 {
	void displayName() {
		System.out.println("Naveenraj");
	}
}

class Employee1 extends person1 {
	void displaySalary() {
		System.out.println("The Salary is : 5000");
	}
}

class Student extends person1 {
	void displayRollNo() {
		System.out.println("Roll No : 101");
	}
}

public class InheritanceEx03 {
	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		Student obj1 = new Student();
		obj.displayName();
		obj.displaySalary();
		obj1.displayName();
		obj1.displayRollNo();

	}

}
