package com.shaji.Day09;

//Types of variable in java

public class TypesofVariables {
	
	int b = 20; //Instances or Object Variable
	
	static int c = 30; //Static or Class Variable

	public static void main(String[] args) {
		
		int a = 10; //Local Variable
		System.out.println(a);
	
		TypesofVariables obj = new TypesofVariables();
		System.out.println(obj.b);
		
		System.out.println(TypesofVariables.c);
		System.out.println(obj.c);
		System.out.println(c);
	}

}
