package com.matthew.test;

class Employee_{
	int eid;
	String ename;
	float esalary;
	Employee_(int eid,String ename,float esalary){
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	void display_() {
		System.out.println("Hi"+ename);	
		System.out.println("Employee ID : "+ eid);
		System.out.println("Employee Salary : "+ esalary);
		}
}

public class Core {
	public static void main(String[] args) {
	Employee_ emp1 = new Employee_(101,"Matthew",2000.0f);
//	emp1.display_();
	
	Employee_ emp2 = new Employee_(102,"Barath",4000.0f);
//	emp2.display_();

	
	Employee_ arr[] = new Employee_[2];
	
	arr[0] = emp1;
	arr[1] = emp2;
	
	for(int i = 0;i<arr.length;i++) {
		arr[i].display_();
	}
	}
}


