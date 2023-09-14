package com.muthu.day8;
class Employee{
	int eid;
	String ename;
	float esalary;
	
	//constructor
	Employee(int id,String name,float salary){
		System.out.println("Inside constructor");
		 eid = id;
		ename=name;
		esalary=salary;
		
		}
	//Methods
	void display() {
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esalary);
	}
	
}
public class DAY8 {
	public static void main(String[]args) {
		//object creation and calling the constructor
		Employee muthu=new Employee(11949,"muthu",2000f);
		//method calling
		muthu.display();
		//object creation
		Employee Dominc=new Employee(11964,"Dominc",2000f);
		//object creation
		Dominc.display();
	}
	

}
