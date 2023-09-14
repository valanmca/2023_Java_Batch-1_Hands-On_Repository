package com.madhan.day08;

class Employee
{
	//Variable
	int eid;
	String ename;
	float esalary;	
	
	//constructor
	 Employee(int id, String name, float salary)
	{
		System.out.println("Inside Constructor");
		eid=id;     //if we give same name,it will return default value of datatype
		ename=name;      /*      Employee id:0
		                    Employee Name:null
//		                      Employee Salary:0.0 */
		esalary=salary;
	}
	
	//method
	void display()
	{
	
		System.out.println("Employee id:" +eid);
		System.out.println("Employee Name:" +ename);
		System.out.println("Employee Salary:" +esalary);
		
	}
}



public class OopsExample1 {

	public static void main(String[] args) {
		Employee madhan=new Employee(1,"Madhan",10000);
		madhan.display();
		Employee aravindh=new Employee(2,"Aravindh",20000);
		aravindh.display();
		Employee sankar=new Employee(3,"Sankar",30000);
		sankar.display();

	}

}
