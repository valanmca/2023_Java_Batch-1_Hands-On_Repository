package com.shaji.Day14;

interface SalaryPlan {
	void payment();

	void paymentType();
}

abstract class Employee implements SalaryPlan {
	public void payment() {
		System.out.print("I will get the Payment, ");
	}

	public abstract void paymentType();
}

class fulltimeEmployee extends Employee {
	public void paymentType() {
		System.out.println("Monthly wise");
	}
}

class freelancerEmployee extends Employee {
	public void paymentType() {
		System.out.println("Day wise");
	}
}

public class Interface5 {

	public static void main(String[] args) {
		fulltimeEmployee fte = new fulltimeEmployee();
		fte.payment();
		fte.paymentType();

		System.out.println("");

		freelancerEmployee fle = new freelancerEmployee();
		fle.payment();
		fle.paymentType();

	}

}
