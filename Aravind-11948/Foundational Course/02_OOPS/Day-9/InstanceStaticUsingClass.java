package com.aravind.day9;
class Employee
{
	 static String org = "relevantz";
	int eid;
	
	
	Employee(int eid)
	{
		
		this.eid=eid;
		
	}
	
	void display()
	{
		System.out.println("Employee organization "+Employee.org);
		System.out.println("employee id="+eid);
	}
}
public class InstanceStaticUsingClass {
	

	public static void main(String[] args) {
		Employee obj=new Employee(11948);
		
		obj.display();
		Employee obj2=new Employee(11945);
		obj2.display();
		
		
	}

}
