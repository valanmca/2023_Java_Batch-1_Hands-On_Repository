package com.swetha.day9;

	
public class Employee {
	static String org="relevantz";    // Static Variable
	int eid;                          //Instance variable
	
	Employee(int eid){              //Constructor
		
		this.eid=eid;
	}
   void display() {          //Method
			System.out.println(eid);
			
		}
	

	public static void main(String[] args) {
		System.out.println(Employee.org);
		
		Employee swetha=new Employee(11956);
		swetha.display();
		
		Employee swe=new Employee(11946);
		swe.display();

	}
}


