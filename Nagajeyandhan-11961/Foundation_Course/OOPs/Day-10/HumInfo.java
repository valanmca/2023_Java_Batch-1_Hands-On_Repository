//Heirarchical inheritance

package com.jeyandhan.day10;

class per { // superclass

	void displayName() {
		System.out.println("");
		System.out.println("My name is: Jeyandhan");
		System.out.println("My name is: Shaji");

	}
}

class Emp extends per { // sub class of per
	void displaySalary() {
		System.out.println("");
		System.out.println("Salary : 10000");
		System.out.println("Salary: 5000");

	}
}

class Student extends per { // sub class of per
	void displayRollNo() {
		System.out.println("");
		System.out.println("My RNo is: 21");
		System.out.println("My RNo is: 23");

	}
}

public class HumInfo {

	public static void main(String[] args) {
		// obj creation for Emp sub class
		Emp obj = new Emp();

		// obj creation for Student sub class
		Student obj1 = new Student();

		// method calling
		System.out.println("\t\n ***** Person and Employee Class*****");
		obj.displayName();
		obj.displaySalary();

		System.out.println("\t\n***** Person and Student Class*****");

		obj1.displayName();
		obj1.displayRollNo();
	}

}
