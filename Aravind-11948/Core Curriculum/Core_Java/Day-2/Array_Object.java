package com.core.day_02;

//array object
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
		System.out.println("empi id:"+eid);
		System.out.println("empi name:"+ename);
		System.out.println("empi salary:"+esalary);
	}
	
}

public class Array_Object {

	public static void main(String[] args) {
		 employee emp1=new employee(101,"Aravind",4000);
		 employee emp2=new employee(102,"madhan",5000);
		 
		 employee emp[]=new employee[2];
		 
		 emp[0]=emp1;
		 emp[1]=emp2;
		 
		 for (int i=0;i<emp.length;i++)
		 {
			 emp[i].display();
		 }
		
	}

}
