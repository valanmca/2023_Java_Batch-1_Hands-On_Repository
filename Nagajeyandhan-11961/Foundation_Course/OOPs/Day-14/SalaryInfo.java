//Employee SalaryInfo using interface, abstract and concrete class

package com.jeyandhan.day14;

interface SalaryPlan { // interface
	void payment();

	void paymentType();
}

abstract class Employee implements SalaryPlan { // abstract class
	public void payment() {
		System.out.print("I will get the payment,");
	}

	public abstract void paymentType();
}

class FullTimeEmployee extends Employee { // concrete class
	public void paymentType() {
		System.out.println(" Monthly wise");
	}
}

class FreeLanceEmployee extends Employee {
	public void paymentType() {
		System.out.println(" Day wise");
	}
}

public class SalaryInfo {

	public static void main(String[] args) {

		System.out.println("\tFull Time Employee\n");
		FullTimeEmployee FTE = new FullTimeEmployee(); // object creation

		FTE.payment();// method calling
		FTE.paymentType();

		System.out.println("\n\tFree Lance Employee\n"); // object creation
		FreeLanceEmployee FLE = new FreeLanceEmployee();

		FLE.payment();// method calling
		FLE.paymentType();
	}

}
