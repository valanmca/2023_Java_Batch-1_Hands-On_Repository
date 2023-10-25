package com.shiva.core.day02;

class employee{
	int eid;
	String ename;
	int esalary;
	
	employee(int eid,String ename,int esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	
	void display() 
	{
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+esalary);
	}
}
public class Arraj_Obj {

	public static void main(String[] args) {
		employee emp1=new employee(1,"Sankar",200);
//		emp1.display();
		
		employee emp2=new employee(2,"Shiva",300);
//		emp1.display();
		
		employee emp[]=new employee[2];
		emp[0]=emp1;
		emp[1]=emp2;
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i].display();
		}
	}

}
