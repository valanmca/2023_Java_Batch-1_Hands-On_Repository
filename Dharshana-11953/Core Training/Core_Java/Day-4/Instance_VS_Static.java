package com.dharshu.day4;

public class Instance_VS_Static {

	int a=10;
	static int b=30;
	public static void main(String[] args) {
		Instance_VS_Static obj1= new Instance_VS_Static();
		Instance_VS_Static obj2 = new Instance_VS_Static();
		System.out.println(obj1.a); //10
		System.out.println(obj2.a); //10
		
		obj1.a=20;
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
		System.out.println(Instance_VS_Static.b); //30
	}

}
