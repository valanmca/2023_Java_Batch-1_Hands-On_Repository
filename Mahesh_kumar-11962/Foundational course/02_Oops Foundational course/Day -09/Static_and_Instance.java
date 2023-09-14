package com.mahesh.Oops_day9;

public class Static_and_Instance {

	int instance_var  =10;
	static int static_var =20;
	
	public static void main(String[] args) {
	
		Static_and_Instance obj = new Static_and_Instance();
		int local_var = obj.instance_var+Static_and_Instance.static_var;
		
 		System.out.println("Result :"+local_var);

		
	}

}
