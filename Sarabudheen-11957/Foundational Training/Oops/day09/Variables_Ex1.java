/********* Adding Instance and Static Variable... *******/
package com.sara.day09;

public class Variables_Ex1 {
	int a = 10;// Instance Variable
	static int b = 20;// Static Variable

	public static void main(String[] args) {

		Variables_Ex1 obj = new Variables_Ex1();

		System.out.println(obj.a + Variables_Ex1.b);

	}

}
