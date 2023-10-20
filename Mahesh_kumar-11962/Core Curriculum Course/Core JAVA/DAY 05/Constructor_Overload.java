package com.mahesh.core_java_day_05;

public class Constructor_Overload {

	Constructor_Overload()
	{
		System.out.println("Dafault constructor");
	}
	Constructor_Overload(int a)
	{
		System.out.println("Parameterized constructor ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Overload def = new Constructor_Overload();
		Constructor_Overload parameter = new Constructor_Overload(3);
		
	}

}
