package com.shaji.Day09;

//Instances Vs Static

public class OOPs_Example1 {
	
	int a = 10;

	public static void main(String[] args) {
		OOPs_Example1 obj1 = new OOPs_Example1();
		OOPs_Example1 obj2 = new OOPs_Example1();

		System.out.println(obj1.a); //10
		System.out.println(obj2.a); //10
		
		obj1.a=20;
		
		System.out.println(obj1.a); //20
		System.out.println(obj2.a); //10
	}

}
