package com.jenish.day10;

class Member{
	String Name;
	int Age;
	int PhNo;
	String Address;
	int Salary;
	
	Member(String Name,int Age,int PhNo,String Address,int Salary){
		this.Name=Name;
		this.Age=Age;
		this.PhNo=PhNo;
		this.Address=Address;
		this.Salary=Salary;
	}
	void printSalary() {
		System.out.println("The salary of the member : "+Salary);
	}

	}
	
class Employee7 extends Member{
	String Specialization;
	String Department;
	Employee7(String Name, int Age, int PhNo, String Address, int Salary, String Specialization,String Department) 
	{
		super (Name,Age,PhNo,Address,Salary);
		this.Specialization=Specialization;
		this.Department=Department;
		
	}
		void display1() {
			System.out.println("Name: "+Name);
			System.out.println("Age: "+Age);
			System.out.println("PhNo: "+PhNo);
			System.out.println("Address: "+Address);
			System.out.println("Salary: "+Salary);
			System.out.println("Emp Specialization : " +Specialization);
			System.out.println("Emp Department : " +Department);
		
		
	}
	}
class Manager extends Member{
	String Specialization;
	String Department;
	Manager(String Name, int Age, int PhNo, String Address, int Salary, String Specialization,String Department) 
	{
		super(Name,Age,PhNo,Address,Salary);
		this.Specialization=Specialization;
		this.Department=Department;
	}
	void display() {
		System.out.println("\nName: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("PhNo: "+PhNo);
		System.out.println("Address: "+Address);
		System.out.println("Salary: "+Salary);
		System.out.println("Specialization : " +Specialization);
		System.out.println("Department : " +Department);
	}

	
}


public class Inheritance_Assign_Task1 {

	public static void main(String[] args) {

		
		
		Employee7 obj1 = new Employee7("Jenish",22,987456321,"26xyz",1000,"IT Admin", "IT");
		obj1.display1();
		
		Manager obj2 = new Manager("Muthu", 24, 897456123, "24zxy", 2000, "IT Admin", "IT" );
		obj2.display();
	}

}
