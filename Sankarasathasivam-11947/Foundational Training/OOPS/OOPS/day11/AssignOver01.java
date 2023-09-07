package com.shiva.day11;

//Method Overriding

class SuperClass 
{
	int a;
	SuperClass(int a)
	{
		this.a=a;
	}
	
	void display()
	{
		System.out.println("Value of A : "+a);
	}
}

class SubClass extends SuperClass
{
	SubClass()
	{
		super(10);//super is for calling the different class
		super.display();
		System.out.println("Value of a : "+super.a);
	}
}
public class AssignOver01 {

	public static void main(String[] args) {
		
		SubClass obj=new SubClass();

	}

}
