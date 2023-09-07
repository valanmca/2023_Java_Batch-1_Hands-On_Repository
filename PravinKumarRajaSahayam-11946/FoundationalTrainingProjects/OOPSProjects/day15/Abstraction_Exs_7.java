//Using Abstraction Interfaces 
package com.pravinkumar.day15;
//Over write Method through the Normal class , super class , Sub class , Interfaces
//Interfaces
interface SalaryPlan {
	// we can't declarating the definitions only the body
	void payment();

	void paymentType();
}
//Abstract class or the Sp=super class
abstract class Employee implements SalaryPlan {
	public void payment() {
		System.out.println("I will get the payment ");
	}

	public abstract void paymentType();
}
//Sub class
class FullTimeEmployee extends Employee {
	// We can over write the method
	public void paymentType() {
		System.out.println("Monthly Wise");
	}
}
//Sub class
class FreelanceEmployee extends Employee {
	// we can over write the method like this from the super class in the Sub class
	public void paymentType() {
		System.out.println("Day Wise");
	}
}

public class Abstraction_Exs_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee full = new FullTimeEmployee();
		full.payment();
		full.paymentType();

		FreelanceEmployee free = new FreelanceEmployee();
		free.payment();
		free.paymentType();
	}

}
