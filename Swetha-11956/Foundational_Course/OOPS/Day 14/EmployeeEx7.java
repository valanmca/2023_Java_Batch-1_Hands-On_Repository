package com.swetha.day14;
interface SalaryPlan{
	void payment();
	void paymentType();
}

abstract class Employee implements SalaryPlan{
	public void payment() {
		System.out.print("I will do the payment ");
	}
	public abstract void paymentType();
}


class FullTimeEmployee extends Employee{
	public void paymentType() {
		System.out.println("Monthly wise");
	}
}

class FreelancerEmployee extends Employee{
	public void paymentType() {
		System.out.println("Day wise");
	}
}

public class EmployeeEx7 {

	public static void main(String[] args) {
		FullTimeEmployee obj=new FullTimeEmployee();
		obj.payment();
		obj.paymentType();
		
		FreelancerEmployee obj1=new FreelancerEmployee();
		obj1.payment();
		obj1.paymentType();
		

	}

}
