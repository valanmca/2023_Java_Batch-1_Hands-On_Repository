/***** Creating Interface for SalaryPlan... *******/
package com.sara.day14;

interface SalaryPlan {
	void payment();

	void paymentType();
}

abstract class Employee implements SalaryPlan {
	public void payment() {
		System.out.print("I Will Get the Payment, ");
	}
}

class FullTimeEmployee extends Employee {
	public final void paymentType() {
		System.out.println("Monthly Wise...");
	}
}

class FreeLancer extends Employee {
	public void paymentType() {
		System.out.println("Day Wise...");
	}
}

public class Interfaces_Ex07 {

	public static void main(String[] args) {

		FullTimeEmployee fulltime = new FullTimeEmployee();
		fulltime.payment();
		fulltime.paymentType();

		System.out.println(" ");

		FreeLancer fl = new FreeLancer();
		fl.payment();
		fl.paymentType();

	}

}
