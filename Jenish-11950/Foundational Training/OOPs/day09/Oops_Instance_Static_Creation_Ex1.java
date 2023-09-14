package com.jenish.day09;

//Types of variables in java

public class Oops_Instance_Static_Creation_Ex1 {
	int b=20; //Instance or object variables
	
	static int c=30; //Static or class variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //local variables
		System.out.println(a);
		
		Oops_Instance_Static_Creation_Ex1 obj = new Oops_Instance_Static_Creation_Ex1();
		System.out.println(obj.b);
		
		System.out.println(Oops_Instance_Static_Creation_Ex1.c);
		//System.out.println(obj.c);
		//System.out.println(c);

	}

}
