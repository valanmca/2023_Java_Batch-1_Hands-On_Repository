package com.gayathri.day14;
//combination of interface,abstract,concrete class
interface SalaryPlan
{
	void payment();
	void paymentType();
}

abstract class Employee implements SalaryPlan
{
	public void payment() {
		System.out.print("I will get my salary...");
	}
	public abstract void paymentType();
}
class FullTimeEmployee extends Employee
{
	public void paymentType()
	{
		System.out.println(" in monthly wise");
	}
}
class FreelanceEmployee extends Employee
{
	public void paymentType(){
		System.out.println(" in day wise");
	}
}
public class EmployeeSalary {

	public static void main(String[] args) {
		FullTimeEmployee obj1 =  new FullTimeEmployee();
		obj1.payment();
		obj1.paymentType();
		
		FreelanceEmployee obj2 = new FreelanceEmployee();
		obj2.payment();
		obj2.paymentType();

	}

}
