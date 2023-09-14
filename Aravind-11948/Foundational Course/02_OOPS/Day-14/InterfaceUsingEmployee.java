package com.aravind.day14;
interface Salaryplan
{
	void payment();// by default-public abstract
	void paymentType();
}
abstract class Employee implements Salaryplan
{
	public void payment()
	{
		System.out.print("I will get payment by ");
	}
	public abstract void paymentType( );
	
}
class Fulltime extends Employee
{
	public void paymentType()
	{
		System.out.println("monthly");
	}
}
class Halftime extends Employee
{
	public void paymentType()
	{
		System.out.println("daily");
	}
}


public class InterfaceUsingEmployee {

	public static void main(String[] args) {
		Fulltime obj=new Fulltime();
		obj.payment();
		obj.paymentType();
		 
		Halftime obj1=new Halftime();
		obj1.payment();
		obj1.paymentType();
		

	}

}
