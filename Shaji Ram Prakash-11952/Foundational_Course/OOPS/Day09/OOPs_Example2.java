package com.shaji.Day09;

// Static Vs Instances

public class OOPs_Example2 {

	static int a = 10;

	public static void main(String[] args) {

		System.out.println(OOPs_Example2.a); // 10
		System.out.println(OOPs_Example2.a); // 10

		OOPs_Example2.a = 20;

		System.out.println(OOPs_Example2.a); // 20
		System.out.println(OOPs_Example2.a); // 10

	}

}
