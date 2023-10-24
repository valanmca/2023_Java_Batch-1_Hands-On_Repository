package com.purushoth.day_03;

public class Variable1 {
	static int a=10;
	int b=10;

	public static void main(String[] args) {
		Variable1 obj=new Variable1();
		Variable1 obj1=new Variable1();
		
		System.out.println(obj.a);
		
		obj.a=20;
		
		System.out.println(obj.a);//20
		System.out.println(obj1.a);//20   Same copy if the variable is static.
		
		obj.b=30;
		
		System.out.println(obj.b);//30
		System.out.println(obj1.b);//10  If instance separate copy for every object.

	}

}
