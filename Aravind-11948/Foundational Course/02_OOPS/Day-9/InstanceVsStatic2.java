package com.aravind.day9;

public class InstanceVsStatic2 {
	static int a = 10;// in static it create single memory

	public static void main(String[] args) {
		InstanceVsStatic2 obj1 = new InstanceVsStatic2();// memory created separately for each object
		InstanceVsStatic2 obj2 = new InstanceVsStatic2();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a = 20;// because it contain single memory so change will reflect in all the obj
		System.out.println(obj1.a);
		System.out.println(obj2.a);

	}

}
