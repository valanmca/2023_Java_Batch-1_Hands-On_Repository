package com.mahesh.Oops_day11;

public class Overloading_Intro {

	void method() {
		System.out.println("No arguments");
	}

	void method(String arg) {
		System.out.println("String argument is passed");
	}

	void method(int num) {
		System.out.println("Integer is an argument");
	}

	void method(int n1, int n2) {
		System.out.println("Two Integer arguments are passed");
	}

	public static void main(String[] args) {
		// Overloading
		Overloading_Intro Cl_object = new Overloading_Intro();
		Cl_object.method();
		Cl_object.method("hello");
		Cl_object.method(9);
		Cl_object.method(2, 3);
		
	}

}
