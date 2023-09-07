
//Hierarchical Inheritance
package com.jeyavel.OOPS.day10;

class Member {
	String Name;
	int Age;
	String PhoneNo;
	String Address;
	int Salary;
	
	Member(String Name,int Age,String PhoneNo,String Address,int Salary){
		this.Name=Name;
		this.Age=Age;
		this.PhoneNo=PhoneNo;
		this.Address=Address;
		this.Salary=Salary;
	}
	
	public int printSalary() {
		int printSalary =Salary;	
		return printSalary; 
	}
	
}
class Employee2 extends Member{
  String specilization;
  String departnment;
  Employee2(String Name,int Age,String PhoneNo,String Address,int Salary,String specilization,String departnment){
	  super(Name,Age,PhoneNo,Address,Salary);
	  this.specilization=specilization;
	  this.departnment=departnment;
  }
	void display() {
		System.out.println("Employee Name        ->"+Name);
		System.out.println("Employee Age         ->"+Age);
		System.out.println("Employee Phone No    ->"+PhoneNo);
		System.out.println("Employee Address     ->"+Address);
		System.out.println("Employee Salary      ->"+Salary);
		System.out.println("Employee Spelization ->"+specilization);
		System.out.println("Employee Departnment ->"+departnment);
		System.out.println("-----------------------------------------");
	}
	  
  }

class Manager extends Member{
	String specilization;
    String departnment;
	Manager(String Name,int Age,String PhoneNo,String Address,int Salary,String specilization,String departnment) {
		super(Name,Age,PhoneNo,Address,Salary);
		this.specilization=specilization;
		this.departnment=departnment;
		
	}
	void display() {
		System.out.println("Manager Name         ->"+Name);
		System.out.println("Manager Age          ->"+Age);
		System.out.println("Manager PhoneNo      ->"+PhoneNo);
		System.out.println("Manager Address      ->"+Address);
		System.out.println("Manager Salary       ->"+Salary);
		System.out.println("Manager Spelicization->"+specilization);
		System.out.println("Manager Departnment  ->"+departnment);
		System.out.println("-----------------------------------------");
	}
	
	
}




public class HierarichialInheritanceTask1 {

	public static void main(String[] args) {
		Manager jeyavel = new Manager("jeyavel",23,"8825569448","97/Dajcolony",35000,"Java full stack","MCA") ;
		jeyavel	.display();
		
		Employee2 raj =new Employee2("raj",20,"9150850488","97/D lingapuram colony",15000,"Java full stack","MCA");
		
		raj.display();
		

	}

}
