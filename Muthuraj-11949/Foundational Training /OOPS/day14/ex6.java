//class to interface key implements 
//

package com.muthu.day14;
interface SalaryPlan{
	void payment();
	void paymentType();
}
abstract class Employee implements SalaryPlan{
	public void payment() {
		System.out.print("i will get the payment:");
	}
	public abstract void paymentType();//not define
}
class FullTimeEmployee extends Employee{
	public void paymentType() {
		System.out.println("monthly wise");
	}	
}
class FreelanceEmployee  extends FullTimeEmployee {
	public void paymentType() {
		System.out.println("weekly wise");
	}	
}
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee  FullTimeEmployee=new FullTimeEmployee();
		FullTimeEmployee.payment();
		FullTimeEmployee.paymentType();
		FreelanceEmployee FreelanceEmployee=new FreelanceEmployee();
		FreelanceEmployee.payment();
		FreelanceEmployee.paymentType();
	}

}
