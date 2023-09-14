package com.aravind.day10;
class Member{
	String name;
	int age;
	long  phoneNo;
	String address;
	int salary;
	
	Member(String name,int age,long  phoneNo,String address,int salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNo=phoneNo;
		this.address=address;
		this.salary=salary;
		
	}
	void print()
	{
		System.out.println("Salary ="+salary);
	}
}
class Employee2 extends Member


{
	String Specialization;
	String department;
	Employee2(String Specialization,String department)
	{
		super("Aravind",21,7010621332l,"1/48middlestreet",50000);
		this.Specialization= Specialization;
		this.department=department;
		
	}
	
	

	
	
}
class Manager extends Member
{
	String Specialization ;
	String department;
	Manager(String Specialization,String department)
	{
		super("Aravind",21,7010621332l,"1/48middlestreet",50000);
		this.Specialization= Specialization;
		this.department=department;
		
	}
	void print1()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phoneNo);
		System.out.println(address);
		System.out.println(salary);
		
	}
	
	
	
}


public class Ass1 {

	public static void main(String[] args) {
		Member obj=new Member("Aravind",21,7010621332l,"1/48middlestreet",50000);
		obj.print();
		Employee2 obj1=new Employee2("software","cse");
		
		Manager obj2=new Manager("software","cse");
		obj2.print1();
		
	}

}
