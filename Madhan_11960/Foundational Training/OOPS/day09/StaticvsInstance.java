package com.madhan.day09;

public class StaticvsInstance {
	
	static int a=10;

	public static void main(String[] args) {
		
		StaticvsInstance obj1=new StaticvsInstance();
		StaticvsInstance obj2=new StaticvsInstance();
		
		final int a=10; //only final is permitted inside the main method
		System.out.println(a);		
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		

	}

}
