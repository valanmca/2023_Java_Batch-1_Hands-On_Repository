package com.jeban.OOPsday7;

interface SalaryPlan {
	void Payment();

	void PaymentType();

}

abstract class Employee implements SalaryPlan {
	public void Payment() {
		System.out.println("I will get the Payment");
	}

	public abstract void PaymentType();

}

class FulltimeEmployee extends Employee {
	public void PaymentType() {
		System.out.println("Monthly Wise");
	}
}

class FreelanceEmployee extends Employee {
	public void PaymentType() {
		System.out.println("Day Wise");
	}

}

class PartTime extends Employee {
	public void PaymentType() {
		System.out.println("Hour Wise");
	}
}

public class interface8 {

	public static void main(String[] args) {
		FulltimeEmployee FTE = new FulltimeEmployee();
		FTE.Payment();
		FTE.PaymentType();

		FreelanceEmployee FE = new FreelanceEmployee();
		FE.Payment();
		FE.PaymentType();

		PartTime PT = new PartTime();
		PT.Payment();
		PT.PaymentType();

	}

}
