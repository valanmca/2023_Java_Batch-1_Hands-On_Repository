package com.muthu.day12;

class Employee{
	private String empName;
	private int empId;
	private float salary ;
	//constrctor
	Employee(String empName,int empId,float salary){
    this.empName=empName;
    this.empId=empId;
    this.salary=salary;}
    
	
	public void setSalary(float Salary) {
		this.salary=salary;
		}
	public  float getsalary() {
		return this.salary;
	}
	public String getempName() {
		return getempName();
	}
	
	


	//method
	   void display() {
		   System.out.println("EmpName:"+empName);
		   System.out.println("empId:"+empId);
		   System.out.println("salary:"+salary);
		   
	   }
}

public class ex1oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee muthu=new Employee("muthu",11949, 200.0f);
       muthu.display();
	}

}
