package com.core.day_04;

public class Variables {
 int a=10;

 static int b=10;
 
	public static void main(String[] args) {
		Variables obj1=new Variables();
		Variables obj2=new Variables();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		obj1.b=20;
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
	}

}
