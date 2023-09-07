package com.dharshu.day14;

interface SalaryPlan{
	void payment();
	void paymentType();
	
}

abstract class Employee implements SalaryPlan{
	public void payment() {
		System.out.print("I will get the payment, ");
	}
	public abstract void paymentType();
}

class FullTimeEmployee extends Employee{

	public void paymentType() {
		System.out.println("Monthly wise ");
	}
}

class PartTimeEmployee extends Employee{

	public void paymentType() {
		System.out.println("Day wise ");
	}
}

public class EmployeeSlaray {

	public static void main(String[] args) {
		FullTimeEmployee full=new FullTimeEmployee();
		full.payment();
		full.paymentType();
	
		PartTimeEmployee part =new PartTimeEmployee();
		part.payment();
		part.paymentType();
	}

}
