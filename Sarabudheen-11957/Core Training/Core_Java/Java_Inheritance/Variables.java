package com.sara.CoreJava.Day_05;

public class Variables {

	int instanceVariable = 10;
	static int staticVariable = 20;
	
	public static void main(String[] args) {
		Variables exe = new Variables();
		Variables disp = new Variables();
		System.out.println("INSTANCE VARIABLE");
		System.out.println(exe.instanceVariable);
		System.out.println(disp.instanceVariable);
		
		exe.instanceVariable = 30;
		System.out.println(exe.instanceVariable);
		System.out.println(disp.instanceVariable);
		
		System.out.println("STATIC VARIABLE");
		System.out.println(exe.staticVariable);
		System.out.println(disp.staticVariable);
		
		exe.staticVariable = 40;
		System.out.println(exe.staticVariable);
		System.out.println(disp.staticVariable);
	}

}
