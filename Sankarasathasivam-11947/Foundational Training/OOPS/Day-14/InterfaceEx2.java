package com.shiva.day14;

interface SalaryPlan
{
	void payment();
	void paymentType();
}

abstract class Employee implements SalaryPlan
{
	public void payment()
	{
		System.out.print("I will get the Payment by ");
	}
	public abstract void paymentType();
}

class FullTimeEmployee extends Employee
{
	public void paymentType()
	{
		System.out.println("Month wise");
	}
}

class FreelanceEmployee extends Employee
{
	public void paymentType()
	{
		System.out.println("Day wise");
	}
}

class PartTimeEmployee extends Employee
{
	public void paymentType()
	{
		System.out.println("Hour wise");
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		
		FullTimeEmployee full=new FullTimeEmployee();
		full.payment();
		full.paymentType();
		
		FreelanceEmployee half=new FreelanceEmployee();
		half.payment();
		half.paymentType();
		
		PartTimeEmployee pt=new PartTimeEmployee();
		pt.payment();
		pt.paymentType();

	}

}
