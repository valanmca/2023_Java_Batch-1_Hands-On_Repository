package com.jenish.day12;

class Emp{
	int eid;
	String ename;
	int esalary;
	
	Emp(int eid, String ename, int esalary){
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	
	}
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esalary);
	}
	void SetSalary() {
		esalary = 30000;
		System.out.println(esalary);
		//System.out.println(ename);
		//System.out.println(eid);
	}
}
public class Constructor_Method_Ex1 {

	public static void main(String[] args) {
		Emp emp = new Emp(101,"Jenish",10000);
		emp.display();
		
		emp.SetSalary();
		
		Emp emp1 = new Emp (101, "Jenish",  20000);
		emp1.display();
		

	}

}
