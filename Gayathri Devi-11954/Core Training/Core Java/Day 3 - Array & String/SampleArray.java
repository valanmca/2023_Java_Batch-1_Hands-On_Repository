package com.gayathri.day3;



class Employee {
	int empId;
	String empName;
	int empSalary;

	Employee(int empId, String empName, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	void display() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Salary : " + empSalary + "\n");

	}
}

public class SampleArray {

	public static void main(String[] args) {
		Employee referencename = new Employee(11954, "Gayathri", 10000);
//		referencename.display();

		Employee objectname = new Employee(11958, "Naveen", 10000);
	//	objectname.display();

		Employee emp = new Employee(11942, "Pravin", 10000);
		//emp.display();

		Employee arrobj[] = new Employee[3];
		arrobj[1]=referencename;
		arrobj[2]=objectname;
		arrobj[3]=emp;
		
		
		for(int i=0; i<arrobj.length;i++) {
			arrobj[i].display();
		}
		

	}

}
