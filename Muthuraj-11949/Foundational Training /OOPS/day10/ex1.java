package com.muthu.day10;
//Inheritance method in a 1 .SUPER CLASS 2.SUBCLASS
//Object create last subclass only in a used.
//Superclass and subclass called Extends in a used.
 // many more sub class create so calling previous class
//single inheritance in this one class used.the derived class inherits properties from its parental class.
//this enables code reusability and also adds new features to the code.
//Example:
class Person{//Super class
	void displayName() {
		System.out.println("muthu");
	}
}
class Employee extends Person{ //Sub class
	void displayid() {
		System.out.println(11949);
	}
}
public class ex1 {
         public static void main(String[]args) {
        	 Employee employee=new Employee();
        	 employee.displayName();
        	 employee.displayid();
         }
         
}


