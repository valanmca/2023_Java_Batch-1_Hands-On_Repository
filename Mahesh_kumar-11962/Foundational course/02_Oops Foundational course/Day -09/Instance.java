package com.mahesh.Oops_day9;

public class Instance {

	int a =100;
	
	public static void main(String[] args) {
		Instance obj = new Instance();
		System.out.println("Before");
		System.out.println(obj.a);
		Instance cl_obj = new Instance();
		System.out.println(cl_obj.a);
		System.out.println("After");
		obj.a = 200;
		System.out.println(obj.a);
		System.out.println(cl_obj.a);		

	}

}
