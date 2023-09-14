

//Difference between Instance , Static And Local Variable Declaration And Accessing part
package com.jeyavel.OOPS.day9;


public class OopsExNo5 {
	
	//Declaring Instance Variable or known as Object variable
	int a;
	
	//Declaring Static Variable
	static int c;

	public static void main(String[] args) {
		//Declaring Local variable
		int b = 12;
		//Creating Object to call Instance Variable
		OopsExNo5 inst = new OopsExNo5();
		//Accessing the Instance Variable
		System.out.println("Instance Variable "+inst.a);
		
		//Accessing the Local Variable
		System.out.println("Local Variable "+b);
		
		//Accessing Static Variable
		System.out.println("Static Variable "+c);
		
		

	}

}
