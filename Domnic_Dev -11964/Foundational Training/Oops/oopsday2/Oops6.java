//instance vs static  -- instance
package com.domnic.day9;

public class Oops6 {
       int a=10;
	public static void main(String[] args) {
		
		Oops6 obj1=new Oops6();
		Oops6 obj2=new Oops6();
		
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		
		obj1.a=30;  //reinitializing.....
		
		System.out.println(obj1.a);//30
		System.out.println(obj2.a);//10

	}

}
