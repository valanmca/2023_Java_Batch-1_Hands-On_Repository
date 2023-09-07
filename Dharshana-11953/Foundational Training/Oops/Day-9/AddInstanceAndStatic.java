package com.dharshu.day9;

public class AddInstanceAndStatic {
	
	int a=10;//instance variable
	
	static int b=20;//static variable

	public static void main(String[] args) {
		
		AddInstanceAndStatic add=new AddInstanceAndStatic();
		
		System.out.println("The addition of the instance and static variable:");
		System.out.print(add.a+AddInstanceAndStatic.b);
		
	}

}
