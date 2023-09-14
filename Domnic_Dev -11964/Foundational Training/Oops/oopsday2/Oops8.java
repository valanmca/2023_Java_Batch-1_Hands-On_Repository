package com.domnic.day9;
//employee details
public class Oops8 {
  
	//variables
	static String org="Relevantz";
	int eid;
	
	//constructors
	Oops8(int eid){
		
		this.eid=eid;
	}
	
	//methods
	void display() {
		System.out.println("Organization name :"+Oops8.org);
		System.out.println("Employee Id :"+eid);
		
	}
	public static void main(String[] args) {
		Oops8 domnic=new Oops8(11964);
		domnic.display();
		System.out.println();
		Oops8 jeban=new Oops8(11963);
		jeban.display();
		

	}

}
