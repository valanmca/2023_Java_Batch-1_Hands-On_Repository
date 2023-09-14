
//Instance Variable Allocation
package com.jeyavel.OOPS.day9;

public class OopsExNo7 {
	
	//Instance variable
	int a=10;

	public static void main(String[] args) {
		OopsExNo7 obj1 =new OopsExNo7 ();
		OopsExNo7 obj2 =new OopsExNo7 ();
		System.out.println("Before changing the obj 1 value");
		System.out.println("obj1="+obj1.a);//10
		System.out.println("obj2="+obj2.a);//10
		
		//Changing the obj1 value
		obj1.a = 20;
		//because in Instance variable uses object To execute the object allocates individual Memory(copy) for each creation in stack (Memory) 
		System.out.println("After changing the obj 1 value");
		System.out.println("obj1="+obj1.a);//20
		System.out.println("obj2="+obj2.a);//10
	}

}
