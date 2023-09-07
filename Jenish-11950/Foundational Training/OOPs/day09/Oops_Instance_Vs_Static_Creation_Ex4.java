package com.jenish.day09;

public class Oops_Instance_Vs_Static_Creation_Ex4 {
	static int a=10;

	public static void main(String[] args) {
		Oops_Instance_Vs_Static_Creation_Ex4 obj_1 = new Oops_Instance_Vs_Static_Creation_Ex4();
		Oops_Instance_Vs_Static_Creation_Ex4 obj_2 = new Oops_Instance_Vs_Static_Creation_Ex4();
		
		System.out.println("Elements:" +obj_1.a);//10
		System.out.println("Elements:" +obj_2.a);
		
		obj_1.a=20;
		
		System.out.println("Changed Elements:"+obj_1.a);//20 changed value
		System.out.println("Changed Elements:"+obj_2.a);
	}

}
