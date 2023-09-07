package com.gayathri.day9;

public class StaticObject {
	static int a = 50;
	

	public static void main(String[] args) {
		
		
		  StaticObject obj1 = new StaticObject();
		  StaticObject obj2 = new StaticObject();
		 
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 100;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		//System.out.println(StaticObject.a);
		//System.out.println(StaticObject.a);

	}
}
