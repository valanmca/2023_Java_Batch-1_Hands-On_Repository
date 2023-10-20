package com.jenish.day4;

public class Instance_Static {
	int a=10;
	static int b=30;
	public static void main(String[] args) {
		Instance_Static obj1= new Instance_Static();
		Instance_Static obj2 = new Instance_Static();
		System.out.println(obj1.a); //10
		System.out.println(obj2.a); //10
		
		obj1.a=20;
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
		System.out.println(Instance_Static.b); //30
	}
}



	
