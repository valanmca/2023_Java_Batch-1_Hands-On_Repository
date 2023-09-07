package com.jeban.OOPsday3;

class Person{
	void displayName() {
		System.out.println("n1:"+"Jeban Ignesh J");
		System.out.println("n2:"+"Domnic Dev k");
		System.out.println("n3:"+"Sarabudheen ");
	}
}

class Employee extends Person{
	void Salary() {
		System.out.println("n1 Salary is:"+8542);
		System.out.println("n2 Salary is:"+8542);
		System.out.println("n3 Salary is:"+1000000);
	}
}

public class inheritance2 {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.displayName();
		obj.Salary();

	}

}
