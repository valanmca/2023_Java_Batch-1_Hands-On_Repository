package com.jeban.JavaArray;

class Employee {
	int Emp_id;
	String Name;
	float Salary;

	Employee(int Emp_id, String Name, float Salary) {
		this.Emp_id = Emp_id;
		this.Name = Name;
		this.Salary = Salary;
	}

	void display() {
		System.out.println("Employee Id:" + Emp_id);
		System.out.println("Employee Name:" + Name);
		System.out.println("Employee Salary:" + Salary);
	}
}

public class Array1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Jeban", 10000);
		
		Employee emp2 = new Employee(102,"Ignesh",20000);
		
		Employee emp[]=new Employee[2];
		emp[0]=emp1;
		emp[1]=emp2;
		
		for (int i=0;i<emp.length;i++) {
			emp[i].display();
		}
		
	}

}
