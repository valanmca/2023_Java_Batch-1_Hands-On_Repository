package com.purushoth.day_04;

class Employee{
	void calculateSalary(int month){
		System.out.println("Manager and Programmer get different Salaries");
	}
}

class Manager extends Employee{
	void calculateSalary(int month) {
		int Sal=40000*month;
		System.out.println("Manager salary for "+month+" month is "+Sal);
	}
}

class Programmer extends Employee{
	void calculateSalary(int month) {
		int Sal=30000*month;
		System.out.println("Programmer salary for "+month+" month is "+Sal);
	}
}
public class EmployeeClass {

	public static void main(String[] args) {
		Employee obj=new Manager();
		obj.calculateSalary(4);
		Employee obj1=new Programmer();
		obj1.calculateSalary(5);
		

	}

}
