package com.madhan.day14;

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
	abstract public void paymentType();	
}

class FulltimeEmployee extends Employee
{
	public void paymentType()
	{
		System.out.println("Monthly");
	}
}
class FreelanceEmployee extends Employee
{
	public void paymentType()
	{
		System.out.println("Daily Basis");
	}
}
public class InterfaceusingSalaryplan {

	public static void main(String[] args) {
		FulltimeEmployee full=new FulltimeEmployee();
		full.payment();
		full.paymentType();
		
		FreelanceEmployee half=new FreelanceEmployee();
		half.payment();
		half.paymentType();

	}

}
