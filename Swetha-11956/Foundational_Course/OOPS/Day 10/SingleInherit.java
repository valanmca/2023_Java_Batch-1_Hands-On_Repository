package com.swetha.day10;
class Person{         //example of single inheritance
	void displayName() {
		System.out.println("My name is Swetha");
	}
}
class Employe extends Person{
	void displaySalary() {
		System.out.println("My salary is 50,000");
	}
}
public class SingleInherit {

	public static void main(String[] args) {
		Employe obj=new Employe();
		obj.displayName();
		obj.displaySalary();
		

	}

}
