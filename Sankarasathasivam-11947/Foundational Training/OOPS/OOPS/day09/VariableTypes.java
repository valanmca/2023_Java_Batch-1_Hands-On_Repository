package com.shiva.day09;

//Types of variables in java

public class VariableTypes {
	
		int b=20;//Instance Or Object Variable
		
		static int c=60;//Static or class variable

	public static void main(String[] args) {
		
		int a=10;//Local Variable
		System.out.println(a);
		
		VariableTypes obj=new VariableTypes();
		System.out.println(obj.b);//Instance
		
		System.out.println(VariableTypes.c);//static
		
		System.out.println(obj.c);//static
		
		System.out.println(c);//static
	}

}
