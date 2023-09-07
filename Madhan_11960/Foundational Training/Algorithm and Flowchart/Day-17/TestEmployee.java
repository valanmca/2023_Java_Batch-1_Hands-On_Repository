package com.madhan.day17;

class Employee
{
	private int id;
	private String firstName; 
	private String lastName; 
	private int salary;
	
	public Employee(int id,String firstName,String lastName,int salary)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getName()
	{
		return firstName+" "+lastName;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getAnnualSalary()
	{
		int annualSalary=salary*12;
		return annualSalary;
	}
	public double raiseSalary(int percent)
	{
		double raiseSalary=(getSalary()*(percent*0.01)+getSalary());
		return raiseSalary;
	}
	public String toString()
	{
		String detail="Empid:"+getId()+"\nFirstName:"+getFirstName()+"\nLastName:"+getLastName()+"\nSalary:"+getSalary();
		return detail;
	}
	
}

public class TestEmployee {

	public static void main(String[] args) {
	  Employee emp=new Employee(11960,"Madhan","P",20000);
	  System.out.println(emp.toString());
	  
//	  Employee emp1=new Employee(7,"Dhoni","MS",500);
//	  System.out.println("Emp Id:"+emp1.getId());
//	  System.out.println("First Name:"+emp1.getFirstName());
//	  System.out.println("LastName:"+emp1.getLastName());
//	  System.out.println("Full Name:"+emp1.getName());
//	  System.out.println("Salary:"+emp1.getSalary());
//	  System.out.println("Annual Salary:"+emp1.getAnnualSalary());
//	  System.out.println("Raised Salary:"+emp1.raiseSalary(10));
	}

}
