package com.mahesh.core_java_day_05;

public class Variables {

	int instance_variable = 10;
	static int static_variable = 20;
	public static void main(String[] args) {
		
		Variables exe = new Variables();
		Variables disp = new Variables();
		System.out.println("INSTANCE VARIABLE");
		System.out.println(exe.instance_variable);
		System.out.println(disp.instance_variable);
		
		exe.instance_variable = 30;
		System.out.println(exe.instance_variable);
		System.out.println(disp.instance_variable);
		
		System.out.println("STATIC VARIABLE");
		System.out.println(exe.static_variable);
		System.out.println(disp.static_variable);
		
		exe.static_variable = 40;
		System.out.println(exe.static_variable);
		System.out.println(disp.static_variable);
		
		
		
		
		

	}

}
