/************ Example for Static Variable... ************/
package com.sara.day09;

public class Variables_Ex3 {
	static int a = 10;

	public static void main(String[] args) {
		Variables_Ex3 obj1 = new Variables_Ex3();
		Variables_Ex3 obj2 = new Variables_Ex3();

		System.out.println(obj1.a);// 10
		System.out.println(obj2.a);// 10

		obj1.a = 20;

		System.out.println(obj1.a);// 20
		System.out.println(obj2.a);// 20

	}

}
