//example hierarchical class

//
package com.muthu.day10;
class Person1{//Super class
	void displayName() {
		System.out.println("muthu");
	}
}
class Employee1 extends Person1{ //Sub class

	void displayid() {
		System.out.println(11949);
	}
}
class Student extends Person1{
	void displayRollno() {
		System.out.println(10);
	}
}
public class ex2 {
         public static void main(String[]args) {
        	 Employee1 employee=new Employee1();
        	 Student  student=new Student();
        	 employee.displayName();
        	 employee.displayid();
        	 student.displayRollno();
         }
         
}

