package com.dharshu.day2;

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


public class JavaArray {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Jenish","Male", 2000.0f);
		//emp1.display();
		Employee emp2 = new Employee(102,"Naveen","Male", 3000.0f);
		//emp2.display();
		Employee emp3 = new Employee(103,"Dharshana","Female", 4000.0f);
		//emp3.display();
		Employee emp[] = new Employee[3]; //int arr[] = new int[3]- primitive array
		//emp[0] = emp1;
		//emp[1] = emp2;
		//emp[2] = emp3;
		
		for(int i=0; i<emp.length; i++) {
			emp[i].display();
		}
		

	}

}
