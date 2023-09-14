package com.jeban.OOPsday2;

public class VariablesStaticInstance {

	int b ;// Instance or Object Variable

	static int c;// Static or Class Variables

	public static void main(String[] args) {
		int a =10;// Local variable
		System.out.println(a);// we can call local variable by directly using the variable

		// to call Instance variable we need to create object and call it with object
		// ref Variable
		VariablesStaticInstance obj = new VariablesStaticInstance();
		System.out.println(obj.b);

		// to call static variable or class variable there are three methods
		System.out.println(VariablesStaticInstance.c);// by using class name
		System.out.println(obj.c);// by using object ref variable
		System.out.println(c);// by directly using variable name

	}

}
