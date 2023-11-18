//Instance vs Static

package com.jeyandhan.day05;

public class InstanceVsStatic {
	
	int a = 10;
	static int b = 20;
	
	public static void main(String[] args) {
		
		//Instance 
		
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println("\n");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 20;
		System.out.println("\n");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		//Static
		System.out.println("\n");
		InstanceVsStatic obj3 = new InstanceVsStatic();
		InstanceVsStatic obj4 = new InstanceVsStatic();
		
		System.out.println(obj3.b);
		System.out.println(obj4.b);
		
		obj3.b = 10;
		System.out.println("\n");
		System.out.println(obj3.b);
		System.out.println(obj4.b);
	}

}
