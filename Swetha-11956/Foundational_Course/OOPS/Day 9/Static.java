package com.swetha.day9;

public class Static {
     static int a=10;
	public static void main(String[] args) {
		Static obj1=new Static();
		Static obj2=new Static();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;    //Changing the obj1 value from 10 to 20
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}

}
