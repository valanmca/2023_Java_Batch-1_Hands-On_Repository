package com.dharshu.day9;

public class StaticObject {
	
	static int a=10;

	public static void main(String[] args) {
		
		//InstanceObject obj1=new InstanceObject();
		//InstanceObject obj2=new InstanceObject();
		
		System.out.println(StaticObject .a);//10
		System.out.println(StaticObject .a);//10
		
		a=20;
		//obj2.a=20;
		
		System.out.println(StaticObject .a);//20
		System.out.println(StaticObject .a);//20 ----solution is in notepad.
	}

}
