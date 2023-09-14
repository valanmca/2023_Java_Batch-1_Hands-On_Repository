package com.naveen.day14;

//Implemented SalaryPlan using Interface, Abstract, Normal class
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
		System.out.println(" Monthly wise.");
	}
}

class FreelanceEmployee extends Employee {
	public void paymentType() {
		System.out.println(" Day wise.");
	}
}

public class InterfaceEx07 {

	public static void main(String[] args) {

		FullTimeEmployee fte = new FullTimeEmployee();
		fte.payment();
		fte.paymentType();

		FreelanceEmployee fe = new FreelanceEmployee();
		fe.payment();
		fe.paymentType();
	}

}
