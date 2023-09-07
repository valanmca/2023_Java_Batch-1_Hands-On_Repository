//instance vs static   ---static
package com.domnic.day9;

public class Oops7 {
       static int a=10;
	public static void main(String[] args) {
		
		Oops7 obj1=new Oops7();
		Oops7 obj2=new Oops7();
		
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		
		obj1.a=30;  //reinitializing.....
		
		System.out.println(obj1.a);//30
		System.out.println(obj2.a);//30
		
		
		System.out.println(Oops7.a);//30


	}

}
