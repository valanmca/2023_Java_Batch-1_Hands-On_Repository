package com.shiva.day14;

//Interface and using extends

interface MyInterface01
{
	void addition(int a,int b);//abstract,public
	void subtraction(int a,int b);
}

interface MyInterface02 extends MyInterface01
{
	void multiplication(int a,int b);
	void division(int a,int b);
}
class Calculator01 implements MyInterface02
{
	public void addition(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	
	public void subtraction(int a,int b)
	{
		System.out.println("Subtraction : "+(a+b));
	}
	
	public void multiplication(int a,int b)
	{
		System.out.println("multiplication : "+(a*b));
	}
	
	public void division(int a,int b)
	{
		System.out.println("division : "+(a/b));
	}
}
public class Interface03 {

	public static void main(String[] args) {
		
		MyInterface02 obj=new Calculator01();
		obj.addition(10, 20);
		obj.subtraction(100, 50);
		obj.multiplication(100, 50);
		obj.division(100, 50);
	}

}
