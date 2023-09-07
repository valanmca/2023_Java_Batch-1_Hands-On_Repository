package com.mahesh.Oops_day12;

public class Emp {

	protected int eid;
	private int esalary; // support only inner class
	protected String ename;
	
	Emp(int id,int salary,String name)
	{
		this.eid=id;
		this.esalary=salary;
		this.ename=name;
	}
	
	
	void display()
	{
		System.out.println("Employee Id :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+getEsalary());
		System.out.println();
	}
	
	public void setEsalary(int esalary) { 
		//Setter method()
		this.esalary = esalary;
	}
	
	public int getEsalary() {
		//Getter method()
		return this.esalary;
	}

	public static void main(String[] args) {
		
		Emp mahesh = new Emp(111, 80000, "Mahesh");
		mahesh.display();
		mahesh.setEsalary(12000);
		mahesh.display();
		

	}

}
