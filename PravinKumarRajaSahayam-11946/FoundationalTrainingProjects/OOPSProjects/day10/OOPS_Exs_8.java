//Using Instance Variables and Static Variables Employees itself
package com.pravinkumar.day10;
class Employee {
	// Variables
	int eid;
	static String org = "Relevantz";

	// Constructors
	Employee(int eid) {
		this.eid = eid;
	}

	// Method
	void display() {
		System.out.println("Employee Id are : " + eid);
		System.out.println("Organization : " + org);
	}

public class OOPS_Exs_8 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee pravinkumar = new Employee(101);
			pravinkumar.display();
		}
	}
}








