
//to check the Memory allocation of Static Instance Variable
package com.jeyavel.OOPS.day9;

public class OopsExNo8 {

	//Creating a Static Instance variable
		static int a=10;

		public static void main(String[] args) {
			OopsExNo8 obj1 =new OopsExNo8 ();
			OopsExNo8 obj2 =new OopsExNo8 ();
			System.out.println("Before changing the obj 1 value");
			System.out.println("obj1="+obj1.a);//10
			System.out.println("obj2="+obj2.a);//10
			
			//Changing the obj1 value
			obj1.a = 20;
			System.out.println("using class name to display Static "+OopsExNo8.a);
			//
			System.out.println("After changing the obj 1 value");
			System.out.println("obj1="+obj1.a);//20
			System.out.println("obj2="+obj2.a);//10
		}

}
