package com.purushoth.day9;

class Employee{
	//Variable
	static String org="Relevantz";
	int eid;
	String ename;
	
	//Employee
	Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	
	//Method
	void show() {
	    System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Organization: "+org);

	}
	
}

public class EmployeeObject {

	public static void main(String[] args) {

		Employee sara=new Employee(11,"Sara");
		
		sara.show();
		
		Employee naga=new Employee(12,"Naga");
		naga.show();
		
		naga.eid=15;
				
		naga.show();
		
		
		

	}

}//Employee object creation using instance and static variable.
