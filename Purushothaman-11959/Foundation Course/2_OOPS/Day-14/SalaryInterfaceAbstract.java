package com.purushoth.day14;

interface SalaryPlan {
	void payment();
	void paymentType();
}

abstract class Employee implements SalaryPlan {
	public void payment() {
		System.out.print("I will get the payment, ");
	}
	public abstract void paymentType();
}

class FullTimeEmployee extends Employee {
	public void paymentType() {
		System.out.println("Monthly wise");
	}
}

class FreelanceEmployee extends Employee {
	public void paymentType() {
		System.out.println("Day wise");
	}
}
public class SalaryInterfaceAbstract {

	public static void main(String[] args) {
       FullTimeEmployee fte=new FullTimeEmployee();
       fte.payment();
       fte.paymentType();
       
       FreelanceEmployee fle=new FreelanceEmployee();
       fle.payment();
       fle.paymentType();
		
	}

}//Salary Plan in interface and abstract.
