package com.mahesh.Oops_day14;
interface MyInterface_01
{
	void add(int v1,int v2);
	void subtract(int v1,int v2);
	
}

interface MyInterface_02
{
	void multiplication(int v1,int v2);
	void divition(int v1,int v2);
	
}
class Calculators implements MyInterface_01,MyInterface_02
{
	public void add(int a,int b)
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
public class Interface_recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculators ref = new Calculators();
		System.out.println("CALCULATOR PROGRAM USING 2 INTERFACES");
		
		ref.add(9,4);
		ref.subtract(9,4);
		ref.multiplication(8,3);
		ref.divition(79,6);
	}

}
