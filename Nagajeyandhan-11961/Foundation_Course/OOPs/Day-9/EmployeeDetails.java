//Employee Details using static and instance variables

package com.jeyandhan.day09;

class Employee{
	//variables
	
	static String organization;
	int eid;
	
	//constructor
	Employee(int eid){
		this.eid = eid;
	}
	
	//method
	
	void disp() {
		System.out.println("");
		System.out.println("The name of the Organization is..."+organization);
		System.out.println("The Employee Id is..."+eid);
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		//object creation and constructor calling 
		Employee.organization ="Relevantz";
		
		Employee naga = new Employee(101);
		naga.disp();
		
		Employee jeyandh = new Employee(102);
		jeyandh.disp();
		
	}

}
