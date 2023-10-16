package com.naveen.day2;
/*Array of storing objects.*/


class Employee {
	int eid;
	String ename;
	float esalary;

	Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	void display() {
		System.out.println("\nThe Employee Id: " + eid);
		System.out.println("The Employee Name: " + ename);
		System.out.println("The Employee Salary: " + esalary);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Employee obj = new Employee(101, "Naveen", 5000);
		//obj.display();

		Employee obj1 = new Employee(102, "Gayathri", 6000);
		//obj1.display();
		
		Employee emp[] = new Employee[2];
		emp[0] = obj;
		emp[1] = obj1; // if it is not initialized it will throw null pointer exception. if it is not a object then it will show default values.
		
		for(int i=0; i<emp.length; i++) {
			emp[i].display();
		};
	}

}
