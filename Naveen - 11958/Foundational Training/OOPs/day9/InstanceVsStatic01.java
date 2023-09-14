package com.naveen.day9;

public class InstanceVsStatic01 {

	static int a = 10;

	public static void main(String[] args) {
		InstanceVsStatic01 obj1 = new InstanceVsStatic01();
		InstanceVsStatic01 obj2 = new InstanceVsStatic01();
		// If we access using object for static variable, In case of any modification in
		// data
		// It will reflect on both the objects. So , It will print 20 20 in this
		// program.
		// If we use class name for calling the variable we can get correct output.

		System.out.println(obj1.a); // 10
		System.out.println(obj2.a); // 10

		obj1.a = 20;

		System.out.println(obj1.a); // 20
		System.out.println(obj2.a); // 20
	}

}
