//Instance vs Static
package com.matthew.day09;

public class InstanceExample {
	//creating an instance
	int a =10;
	public static void main(String[] args) {
		//creating an object
		InstanceExample obj1 = new InstanceExample();
		InstanceExample obj2 = new InstanceExample();
		
		System.out.println("obj1 "+obj1.a);
		System.out.println("obj2 "+obj2.a);
		
		obj1.a = 20;
		
		System.out.println("obj1 "+obj1.a);
		System.out.println("obj2 "+obj2.a);
		
	}

}
