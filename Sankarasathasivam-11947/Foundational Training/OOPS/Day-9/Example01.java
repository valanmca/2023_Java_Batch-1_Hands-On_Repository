package com.shiva.day09;

public class Example01 {
	
	static int a=10;
	
	public static void main(String[] args) 
	{
//		InstanceVsStatic obj1=new InstanceVsStatic();
//		InstanceVsStatic obj2=new InstanceVsStatic();
		
		System.out.println(a);//10
		System.out.println(a);//10
		
		Example01.a=20;
		
		System.out.println(a);//20
		System.out.println(a);//20

	}
}
