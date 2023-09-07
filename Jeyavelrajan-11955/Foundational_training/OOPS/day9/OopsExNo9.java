

//Another ex for getting and printing values through Instance And static Instance Variable
package com.jeyavel.OOPS.day9;

public class OopsExNo9 {
	static String org="Relevantz";
	int empid;
	
	OopsExNo9(int empid){
	
		this.empid=empid;
		
	}
	void display() {
		System.out.println("--------------------");
		System.out.println("Employee id  "+empid);
		System.out.println("Organization "+org);
		System.out.println("--------------------");
		
	}
	

	public static void main(String[] args) {
		OopsExNo9 jeyavel = new OopsExNo9(11955);
		OopsExNo9 rajan = new OopsExNo9(11951);
		jeyavel.display();
		rajan.display();
		

	}

}
