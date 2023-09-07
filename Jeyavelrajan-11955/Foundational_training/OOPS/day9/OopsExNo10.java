
//Program for How to call a Static Variable and Instance Variable
//Static variable Make Your Program Memory Eficient 
package com.jeyavel.OOPS.day9;

public class OopsExNo10 {

	void MyMethod1() {
		System.out.println("This is the way to call -->Instance Method<--");
	}
	
	static void MyMethod2() {
		System.out.println("This is the Way to Call -->Static Instance Method<--");
	}
	
	public static void main(String[] args) {
		
		//Creating Object to call the instance Variable
		OopsExNo10 obj1 = new OopsExNo10();
		obj1.MyMethod1();
		
		//Print Static Method Using Classname.Method()(because ststic does not required object
		//it uses class to print (or) Allocates the Memory 
		OopsExNo10.MyMethod2();
		

	}

}
