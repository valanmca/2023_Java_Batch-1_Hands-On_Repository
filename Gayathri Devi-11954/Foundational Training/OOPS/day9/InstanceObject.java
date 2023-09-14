package com.gayathri.day9;

//instance vs static
public class InstanceObject {
	int a = 10;

	public static void main(String[] args) {
		InstanceObject obj1 = new InstanceObject();
		InstanceObject obj2 = new InstanceObject();

		System.out.println(obj1.a);
		System.out.println(obj2.a);

		obj1.a = 20;

		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}

}
