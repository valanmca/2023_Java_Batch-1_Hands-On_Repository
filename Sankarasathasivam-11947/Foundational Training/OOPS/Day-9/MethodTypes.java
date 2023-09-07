package com.shiva.day09;

//Types of Methods
public class MethodTypes {
	
	void mymethod1()
	{
		System.out.println("Instance Method");
	}
	
	static void mymethod2()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		
		MethodTypes obj=new MethodTypes();
		obj.mymethod1();//instance
		
		MethodTypes.mymethod2();//static
		obj.mymethod2();
	}

}
