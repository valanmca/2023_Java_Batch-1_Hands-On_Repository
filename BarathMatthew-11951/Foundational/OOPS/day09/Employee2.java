package com.matthew.day09;

public class Employee2 {
	int eid;
	static String org = "Relevantz" ;
	Employee2(int eid){
		this.eid = eid;
	}
	
	void details() {
		System.out.println("Employee id :" + eid);
		System.out.println("org : " + org);
	}
	
	public static void main(String[] args) {
		Employee2 Matthew = new Employee2(11951);
		Employee2 Barath = new Employee2(11952);
		Matthew.details();
		Barath.details();
	}

}
