package com.jenish.day14;

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
class FullTimeEmployee extends Employee {
	public void paymentType() {
		System.out.println(" Monthly Wise - FullTime ");
	}
}
class FreelanceEmployee extends Employee {
		public void paymentType() {
			System.out.println(" Day Wise -  Freelance ");
		}
}
public class Interface_UsingInheritance_SalaryPlan_Ex7 {

	public static void main(String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.payment();
		fte.paymentType();
		
		FreelanceEmployee fle = new FreelanceEmployee();
		fle.payment();
		fle.paymentType();

	}

}
