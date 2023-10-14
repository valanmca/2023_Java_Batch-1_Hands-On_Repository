package com.jenish.OopsRecap;


class Employee {
	int empid;
	String empname;
	String empgender;
	float empsalary;

Employee(int empid, String empname,String empgender, float empsalary){
	System.out.println("Employee Details");
	this.empid=empid;
	this.empname=empname;
	this.empgender=empgender;
	this.empsalary=empsalary;
}
void display() {
	System.out.println("Employee empid:" +empid);
	System.out.println("Employee empname:" +empname);
	System.out.println("Employee empgender:" +empgender);
	System.out.println("Employee empsalary:" +empsalary); 
}
}
public class Employeesys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101,"Jenish","Male", 2000.0f);
		emp1.display();
		Employee emp2 = new Employee(102,"Naveen","Male", 3000.0f);
		emp2.display();
		Employee emp3 = new Employee(103,"Dharshana","Female", 4000.0f);
		emp3.display();

	}
}
