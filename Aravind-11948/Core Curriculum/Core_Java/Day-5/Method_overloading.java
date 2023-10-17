package com.core.day_05;


public class Method_overloading {
	
	void concat()
	{
		System.out.println("Default method");
	}
	
	void concat(int a)
	{
		System.out.println("One int Argument method =" +a);
	}
	
	void concat(int a,int b)
	{
		System.out.println(a+""+b);
	}
	
	void concat(String  a,String b)
	{
		System.out.println(a+" "+b);
	}
	
	void concat(float  a,float b)
	{
		System.out.println(a+""+b);
	}

	public static void main(String[] args) {
	
		Method_overloading obj=new Method_overloading ();
		obj.concat();
		obj.concat(2);
		obj.concat(2,4);
		obj.concat("Aravind","Subbaian");
		obj.concat(12.57f,45.98f);
	}

}
