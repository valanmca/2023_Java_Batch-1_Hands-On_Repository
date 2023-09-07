package com.mahesh.Oops_day9;

public class Method_Types {

	void method_01()
	{
		System.out.println("Instance method is executed");
	}
	
	static void method_02()
	{
		System.out.println("Static method is executed");
	}
	
	public static void main(String[] args) {
		
		Method_Types obj =new Method_Types();
		obj.method_01();
		Method_Types.method_02();

	}

}
