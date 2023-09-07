
//Hierarchical Inheritance
package com.jeyavel.OOPS.day10;

//parent class
class person1 {
	void displayName() {
		System.out.println("Employee Name Is -> Jeyavelrajan");
	}

}
//derived class
class Employee1 extends person1 {
	void displaySalary() {
		System.out.println("Employee Salary Is ->"+1500);
	}
}
//derived class
class Student extends person1{
	void displayRollNo(){
		System.out.print("Employee RollNo  ->"+11955);
	}
}

public class InheritanceExNo3 {

	public static void main(String[] args) {
//		Employee jeyavel = new Employee();
//		jeyavel.displaySalary();
		Student name = new Student();
		name.displayName();

		name.displayRollNo();

	}


}
