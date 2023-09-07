package com.mahesh.Oops_day9;

public class Employee {

	int eid;
	String ename;
	static String org = "Relevantz";
	
	Employee(int eid,String ename)
	{
		this.eid =eid;	
		this.ename=ename;
	}
	
	void disp()
	{
		
		System.out.println("Employee id : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee Org : "+org);
		System.out.println();
	}
	public static void main(String[] args) {
	
		Employee mahes = new Employee(11962,"Mahesh");
		mahes.disp();
		
		Employee math = new Employee(11959,"Mathew");
		math.disp();
		

	}

}
