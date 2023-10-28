package com.dharshu.day10;

public class Ex_1_Wrapper {

	public static void main(String[] args) {
		
		int a=10; //Primitive
		
		//JDK 1.4 (old Syntax)
		Integer obj1=new Integer(a); //Boxing
		
		int b=obj1.intValue(); //Un-Boxing
		
		//JDK 1.5 (new syntax)
		Integer obj2 = a; //Auto-Boxing
		int c=obj2; //Auto-Un-Boxing.
	}

}
