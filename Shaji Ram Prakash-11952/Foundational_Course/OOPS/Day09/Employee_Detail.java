package com.shaji.Day09;

// Employee_Detail with Static and Instances Variable

public class Employee_Detail {
	
	//Variables
	static String org = "RelevantZ";
	String ename ;
	int eid;
	
	//Constructors
	Employee_Detail(String ename, int eid){
		this.ename = ename;
		this.eid =eid;
	}
	
	//Method
	void display() {
		System.out.println("Oranization : " +org);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee ID : " +eid);
	}
	public static void main(String[] args) {
		Employee_Detail shaji = new Employee_Detail("Shaji", 101);
		shaji.display();
		
		Employee_Detail sara = new Employee_Detail("Sara", 102);
		sara.display();
		
		Employee_Detail BOSS = new Employee_Detail("The BOSS", 103);
		BOSS.display();
		
		

	}

}
