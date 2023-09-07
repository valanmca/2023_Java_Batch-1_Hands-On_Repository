package com.dharshu.day9;

public class InstanceObject {
	int a=10;

	public static void main(String[] args) {
		
		InstanceObject obj1=new InstanceObject();
		InstanceObject obj2=new InstanceObject();
		
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		
		obj1.a=20;
		
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10 ----solution is in notepad.
	}

}
