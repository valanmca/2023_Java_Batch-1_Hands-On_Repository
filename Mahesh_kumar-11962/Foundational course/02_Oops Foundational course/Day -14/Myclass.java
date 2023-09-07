package com.mahesh.Oops_day14;
interface MyInterface
{
	void add(int v1,int v2);
	void subtract(int v1,int v2);
	
}

class Calculator implements MyInterface
{
	public void add(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	
	public void subtract(int a,int b)
	{
		System.out.println("Subtraction : "+(a-b));
	}
}
public abstract class Myclass  {

	public static void main(String[] args) {
		
		MyInterface obj = new Calculator();
		obj.add(4, 7);
		obj.subtract(9, 7);
		
		
	}

}
