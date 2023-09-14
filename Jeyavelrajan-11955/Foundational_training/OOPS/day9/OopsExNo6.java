
//Add a instance variable and Static variable 
package com.jeyavel.OOPS.day9;

public class OopsExNo6 {
	int a=10;
	
	static int b=20;

	public static void main(String[] args) {
		
		System.out.println("Add instance variable and Static variable");
		//Creating Object to Call a Instance
		OopsExNo6 add = new OopsExNo6();
		
		//creating other temporary(local) variable c to add instance variable and Static variable   
		int c= add.a+OopsExNo6.b;
		
		System.out.println(c);

	}

}
