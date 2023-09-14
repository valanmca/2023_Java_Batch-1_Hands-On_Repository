package com.swetha.day9;

public class Addition {
	int a=10;  //Instance variable 
	static int b=20;  //Static variable

	public static void main(String[] args) {
		
           Addition obj=new Addition();
           
           System.out.println("The sum of Instance and Static variable is : "+(obj.a + Addition.b));
	}

}
