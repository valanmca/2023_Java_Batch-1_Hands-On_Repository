package com.madhan.coreday4;

public class InstancevsStatic {
	static int a=20;
	
	int b=10;

	public static void main(String[] args) {
		InstancevsStatic obj1=new InstancevsStatic();
		InstancevsStatic obj2=new InstancevsStatic();
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		obj1.b=30;
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=50;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		

	}

}
