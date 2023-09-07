package com.jenish.day09;
//Using int in mainclass
public class Oops_Instance_Vs_Static_Creation_Ex3 {
	int a=10;

	public static void main(String[] args) {
		Oops_Instance_Vs_Static_Creation_Ex3 obj_1 = new Oops_Instance_Vs_Static_Creation_Ex3();
		Oops_Instance_Vs_Static_Creation_Ex3 obj_2 = new Oops_Instance_Vs_Static_Creation_Ex3();
		
		System.out.println("Elements:" +obj_1.a);//10
		System.out.println("Elements:" +obj_2.a);
		
		obj_1.a=20;
		System.out.println("Changed Elements:"+obj_1.a);//20 changed value
		System.out.println("Changed Elements:"+obj_2.a);

	}

}
