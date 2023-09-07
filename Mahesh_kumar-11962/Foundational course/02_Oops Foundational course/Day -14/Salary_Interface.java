package com.mahesh.Oops_day14;

interface SalaryPlan
{
	void payment();
	void paymentType();
}

abstract class Employee implements SalaryPlan
{
	public void payment()
	{
		System.out.print("I will get the payment,");
	}
	public abstract void paymentType();
	
}

class FulltimeEmp extends Employee
{
	public void paymentType()
	{
		System.out.println("Monthly wise");
	}
}

class FreelanceEmp extends Employee
{
	public void paymentType()
	{
		System.out.println("Day wise");
	}
}
public class Salary_Interface {

	public static void main(String[] args) {
		FulltimeEmp fte = new FulltimeEmp();
		fte.payment();
		fte.paymentType();
		
		FreelanceEmp fle = new FreelanceEmp();
		fle.payment();
		fle.paymentType();

	}

}
