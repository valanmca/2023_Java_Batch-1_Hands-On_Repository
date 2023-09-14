package com.aravind.day11;// super keyword
class SuperClass
{
	int a;
	SuperClass(int a)
	{
		this.a=a;
	}
	void display( )
	{
		System.out.println(a);
	
	}
}
class SubClass extends SuperClass
{
	SubClass(int a)
	{
		super(a);
		super.display();
		System.out.println("value of a:"+super.a);
	}
}

public class SuperKeyWordUsuage {

	public static void main(String[] args) {
		SubClass obj=new SubClass(10);
		
		

	}

}
