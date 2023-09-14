package com.muthu.day8;

class Employee1
{//variables  //instance variables
	int eid;
	String ename;
	float esalary;
	
	// parameterized constructor
	Employee1(int eid,String ename,float esalary){
		
		this. eid = eid;
		this.ename=ename;
		this.esalary=esalary;
		
		}
	//Methods of display the values
	void display() {
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esalary);
	}
	
}
public class dayex1 {
	public static void main(String[]args) {
		//object creation and calling the constructor
		Employee1 muthu=new Employee1(1111,"Muthu",1000f);
		//method calling
		muthu.display();
		//object creation
		Employee1 Dominc=new Employee1(11964,"Dominc",2000f);
		//object creation
		Dominc.display();
	}
	

}
