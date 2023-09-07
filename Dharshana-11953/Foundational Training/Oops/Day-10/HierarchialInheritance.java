package com.dharshu.day10;

class Member{
	String name;
	int age;
	int phone;
	String address;
	int salary;
	
	Member(String name,int age,int phone,String address,int salary){
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary() {
		System.out.println("The salary is:" +salary);
	}
	
}

class Employee2 extends Member{
	String special;
	String dep;
	Employee2(String name, int age, int phone, String address, int salary,String dep,	String special) {
		super(name, age, phone, address, salary);
		this.special=special;
		this.dep=dep;
	}
	
		void display() {
			System.out.println("\nName:" +name);
			System.out.println("Age:" +age);
			System.out.println("PhoneNo:" +phone);
			System.out.println("Address:" +address);
			System.out.println("Salary:" +salary);
		System.out.println("The employee Specialisation:" +special);
		System.out.println("The employee department:" +dep);
	}
	
}

class Manager extends Member{
	String dep;
	String special;
	Manager(String name, int age, int phone, String address, int salary,String dep,	String special) {
		super(name, age, phone, address, salary);
		this.special=special;
		this.dep=dep;
	}
	void disp() {
		
			System.out.println("\nName:" +name);
			System.out.println("Age:" +age);
			System.out.println("PhoneNo:" +phone);
			System.out.println("Address:" +address);
			System.out.println("Salary:" +salary);
			System.out.println("The Manager Specialisation:" +special);
			System.out.println("The Manager department:" +dep);
		}
	}	

public class HierarchialInheritance {

	public static void main(String[] args) {
		Employee2 obj=new Employee2("Dharshu",21,78965,"xyz",12000,"MCA","Trainner");
		
		obj.display();
		
		Manager man=new Manager("Alagar",24,789965,"xyz",21000,"MCA","Trainner");
		man.disp();

	}

}
