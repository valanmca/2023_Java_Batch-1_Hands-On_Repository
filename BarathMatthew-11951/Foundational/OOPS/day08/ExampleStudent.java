package com.matthew.day08;

class Student1 {
	//variable
	String sname ;
	int srollno;
	String department;
	
	//constructor
	
	Student1(String sname,int srollno,String department){
		this.sname = sname;
		this.srollno = srollno;
		this.department = department;
	}
	// method
	
	void display() {
		System.out.println("Name:"+sname);
		System.out.println("Roll No :" + srollno);
		System.out.println("Std : "+department);
	}
}
public class ExampleStudent {

	public static void main(String[] args) {
		// creating object
		
		Student1 matthew = new Student1("Matthew",11951,"CSE");
		matthew.display();

	}

}
