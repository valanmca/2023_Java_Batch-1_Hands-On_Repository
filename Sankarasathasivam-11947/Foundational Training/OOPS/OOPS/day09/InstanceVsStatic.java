package com.shiva.day09;

//Instance Vs Static
public class InstanceVsStatic {
	
	static int a=10;
	
	public static void main(String[] args) 
	{
		InstanceVsStatic obj1=new InstanceVsStatic();
		InstanceVsStatic obj2=new InstanceVsStatic();
		
		System.out.println(a);//10
		System.out.println(obj2.a);//10
		
		obj1.a=20;
		
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
	}
}
