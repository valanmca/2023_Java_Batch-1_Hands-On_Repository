package com.shiva.core.day06;

interface One_1 {
	int a = 10;// public,static,final
}

interface Two_2 extends One_1 {
	int a = 20;
}

interface Three_3 extends One_1, Two_2 {// Multiple Inheritance
	void sum();
}

class Calculator1 implements Three_3 {
	public void sum() {
//		System.out.println(a + b);
		System.out.println(One_1.a + Two_2.a);// To resolve the ambiguity issues
	}
}

public class Interf_03 {

	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		calc.sum();
	}

}
