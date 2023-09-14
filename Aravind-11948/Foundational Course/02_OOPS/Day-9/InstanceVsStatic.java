package com.aravind.day9;//instance 

public class InstanceVsStatic {
	int a=10;//instance variable or object variable

	public static void main(String[] args) {
		
		InstanceVsStatic obj1=new InstanceVsStatic();// memory created separately for each object
		InstanceVsStatic obj2=new InstanceVsStatic();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;//a value in obj1 alone can change 
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		
		

	}

}
