package com.mahesh.Oops_day14;
interface MyInterface_04
{	
    void add(int v1,int v2);
	   
	void subtract(int v1,int v2);
	
}

interface MyInterface_05 extends MyInterface_04
{
    void multiplication(int v1,int v2);
	void divition(int v1,int v2);
	
}
class Calculator_class implements MyInterface_05
{
	public  void add(int a,int b)
	{
		System.out.println("Addition : "+(a+b));	
	}
	
	public void subtract(int a,int b)
	{
		System.out.println("Subtraction : "+(a-b));
	}
	public void multiplication(int a,int b)
	{
		System.out.println("Multiplication : "+(a*b));	
	}
	public void divition(int a,int b)
	{
		System.out.println("Divition :"+(a/b));
	}
}

public class Interface_re_cap {

	public static void main(String[] args)
	{
		
		Calculator_class ref_obj = new Calculator_class();
		ref_obj.add(10, 5);
		ref_obj.subtract(10, 5);
		ref_obj.multiplication(10, 5);
		ref_obj.divition(10, 5);
	
	}

}
