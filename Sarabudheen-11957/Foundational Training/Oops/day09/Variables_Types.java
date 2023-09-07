/********* Types of Variables in Java... *********/
package com.sara.day09;

public class Variables_Types {

	int b;// Instance or Object Variable

	static int c;// Static or Class Variable

	public static void main(String[] args) {
		int a = 10;// Local VAriable
		System.out.println(a);

		Variables_Types obj = new Variables_Types();
		System.out.println(obj.b);

		System.out.println(Variables_Types.c);
		// System.out.println(obj.c);
		// System.out.println(c);

	}

}
