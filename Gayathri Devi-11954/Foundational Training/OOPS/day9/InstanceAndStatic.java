package com.gayathri.day9;

public class InstanceAndStatic {
	// in java, have not global variables, they have instance/object variables
//Instance & static default value int=0,boolean=false,float=0.0,string=null
	int b ;// Instance variable, so it will display using object creation 
	//it will create many memory depending the object creation
	
	static int c;
	//it will create only one time memory creation.  it will display 3 ways

	public static void main(String[] args) {

		int a =9;// local variable //scoope is within the brackets
		System.out.println("Local variable : " + a);
		
		InstanceAndStatic insvari = new InstanceAndStatic();
		System.out.println("Instance Variable : " + insvari.b);
		
		System.out.println("Static variable by calling the class name : "+InstanceAndStatic.c);
		System.out.println("Static variable by calling the object creation: "+insvari.c);
		System.out.println("Static variable by display directly: "+c);
		

	}

}
