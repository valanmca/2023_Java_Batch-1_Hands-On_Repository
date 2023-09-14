package com.mahesh.Oops_day9;

public class Static {

	static int st = 100;
	public static void main(String[] args) {
	
		Static obj = new Static();
		Static cl_obj = new Static();
		
		System.out.println("Before");
		System.out.println(obj.st);
		System.out.println(cl_obj.st);
		
		obj.st = 200;
		
		System.out.println("After");
		System.out.println(obj.st);
		System.out.println(cl_obj.st);
	}

}
