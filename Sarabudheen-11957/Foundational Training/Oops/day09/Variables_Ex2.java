/************ Example for Instance Variable... ************/
package com.sara.day09;

public class Variables_Ex2 {

	int a = 10;

	public static void main(String[] args) {
		Variables_Ex2 obj1 = new Variables_Ex2();
		Variables_Ex2 obj2 = new Variables_Ex2();

		System.out.println(obj1.a);// 10
		System.out.println(obj2.a);// 10

		obj1.a = 20;

		System.out.println(obj1.a);// 20
		System.out.println(obj2.a);// 10

	}

}
