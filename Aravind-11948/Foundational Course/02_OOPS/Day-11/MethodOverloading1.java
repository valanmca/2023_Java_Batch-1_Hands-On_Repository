package com.aravind.day11;// polymorphism 
//compile time 
// find method by arguments memory alocation for parameter in compile time
//method overloading
// in same class 
//method is same  and parameter is different no of arguments 
class MyClass
{
	void Method(String name)// string type no =1 argument
	{
		System.out.println("welcome"+name+ "this is method overloading"
				+ "in same class \r\n"
				+ "method is same  and parameter is different  no of arguments  ");
		}
	void Method(int n)// int type  no=1 argument
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial ="+fact);
	}
	void Method(int n,int b)
	{
		int c=n+b;
		System.out.println(c);
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.Method("aravind");
		obj.Method(5);
		obj.Method(2,3);
		

	}

}
