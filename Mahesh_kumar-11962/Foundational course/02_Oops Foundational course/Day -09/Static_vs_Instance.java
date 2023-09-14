package com.mahesh.Oops_day9;

public class Static_vs_Instance {

	int ins_var = 10; //Instance variable (or) object variable.
	static int stc_var = 100;//Static variable (or) class variable.
	
	public static void main(String[] args) {

		String greeting  ="Thank you";//Local variable.
		
		Static_vs_Instance object = new Static_vs_Instance();
		
		
		System.out.println("Instance varible printing :"+object.ins_var);
		System.out.println("Static varible printing :"+stc_var);
		System.out.println("Static varible printing :"+Static_vs_Instance.stc_var);
		System.out.println("Local Variable :"+greeting);
		
		

	}

}
