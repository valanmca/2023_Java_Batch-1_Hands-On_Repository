package com.dharshu.day9;

class Employee{
	static String org="Relevantz";
	int eid;
	String ename;
	float esalary;
	
	Employee(int eid,String ename,float esalary){
		
		
		//this keyword refers the current object.
		//we can avoid name conflict between local and instance variable by using "this" keyword
		
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		
	}
	//instance method
		void display() { //the method name can be anything
			
			System.out.println("\nOrganisation Name:"+Employee.org);
			System.out.println("Employee id:"+eid);
			System.out.println("Employee Name:"+ename);
			System.out.println("Employee Salary:"+esalary);	
					
		}
}

public class EmployeeInstanceAndStatic {

	public static void main(String[] args) {
		//object creation and calling the constructor
				Employee emp=new Employee(101,"Dharshu",12000.0f);
				//method calling
				emp.display();
				
				//we can create 'n' number of object for a single class
				Employee emp1=new Employee(102,"Gayathri",14000.0f);
				emp1.display();
		

	}

}
