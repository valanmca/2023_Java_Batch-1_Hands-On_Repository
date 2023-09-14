package com.muthu.day9;
//	Types of Variables in java
public class ex2 {
	
	int b=20;  //Instance or Object variables
	static int c=30;//Static or class variables

	public static void main(String[] args) {
		int a=10;//local variable
		System.out.println(a);
		
		ex2 obj=new ex2();
		System.out.println(obj.b);
		
		System.out.println(obj.c);
		System.out.println(ex2.c);
		System.out.println(c);
	

		

	}

}
