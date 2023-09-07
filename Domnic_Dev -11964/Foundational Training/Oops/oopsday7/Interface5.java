package com.domnic.oopsday7;
//interface 
interface SalaryPlan {
	void payment();
    void paymentType();
}
abstract class Employee implements SalaryPlan{
	public void payment() {
		System.out.print("I will get the payment, ");
	}
	public abstract void paymentType();
	
}
class FullTimeEmployee extends Employee{
	public void paymentType() {
		System.out.println("Monthly wise");
	}
}
class FreeLancer extends Employee{
	public void paymentType() {
		System.out.println("Day wise");
	}
}
class PartTime extends Employee{
	public void paymentType() {
		System.out.println("Hour wise");
	}
}

public class Interface5 {

	public static void main(String[] args) {
		FullTimeEmployee fte=new FullTimeEmployee();
		fte.payment();
		fte.paymentType();
		
		FreeLancer fl=new FreeLancer();
		fl.payment();
		fl.paymentType();
		
		PartTime pt=new PartTime();
		pt.payment();
		pt.paymentType();
	}

}
