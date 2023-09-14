package com.jeyavel.OOPS.day14;

interface SalaryPlan{
	void Paynment();
	void PaynmentType();
}

abstract class Employee implements SalaryPlan{
	public void Paynment() {
		System.out.println("Iwill Get the Paynment");
	}
	abstract public void PaynmentType();
}


//use extends because we shift abstract class to Normal class
class FullTimeEmployee extends Employee{
	public void PaynmentType() {
		System.out.println("FullTimeEmployee will get A Monthly Paynment");
	}
}

class Freelancer extends Employee{
	public void PaynmentType(){
		System.out.println("FreeLancer will get A Daily  Paynment");
	}
}

public class ExerciseNo7 {

	public static void main(String[] args) {
		FullTimeEmployee fulltime =new FullTimeEmployee();
		fulltime.Paynment();
		fulltime.PaynmentType();
		
		Freelancer flancer =new Freelancer();
		flancer.Paynment();
		flancer.PaynmentType();
	

	}

}
