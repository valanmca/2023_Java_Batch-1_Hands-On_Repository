package com.matthew.day14;

//creating interface to define all the basic methods
interface SalaryPlan{
	void payment();
	void paymentType();
	int pi = 12;
}

//creating Employee class as abstract because some method we have to define and some to declare
//use implements because we shift from interface to abstract
//shows the employee will receive salary or not
abstract class Employee implements SalaryPlan{
	public void payment() {
		System.out.print("I will get the payment, ");
	}
	public abstract void paymentType();
	
}

//use extends because we shift from abstract to normal class
//shows how payment is received
class FullTimeEmployee extends Employee{
	public void paymentType(){
		System.out.println("Monthly wise");
	}
}


class FreelanceEmployee extends Employee{
	public void paymentType() {
		System.out.println("Day wise");
	}
}

public class Assessment3 {

	public static void main(String[] args) {
		
		//creating an object for FullTimeEmployee
		FullTimeEmployee person1 = new FullTimeEmployee();
		person1.payment();
		person1.paymentType();
		
		System.out.println("------------------------------------");
		//////////////////
		
		FreelanceEmployee person2 = new FreelanceEmployee();
		
		person2.payment();
		person2.paymentType();

	}

}
