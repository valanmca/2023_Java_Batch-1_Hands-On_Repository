package com.madhan.coreday3;

class Employ{
	int eid;
	String ename;
	int esal;
	
	Employ(int eid,String ename,int esal)
	{
		this. eid=eid;
		this. ename=ename;
		this. esal=esal;
	}
	
	void display()
	{
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+esal);
		
	}
}
	

public class JavaArray {

	public static void main(String[] args) {
		Employ emp1=new Employ(1,"Madhan",10000);
		Employ emp2=new Employ(2,"Aravindh",20000);
		
		Employ emp[]=new Employ[2];
		emp[0]=emp1;
		emp[1]=emp2;
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i].display();
		}
		

	}

}
